package com.homework.board.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.homework.board.model.dto.Board;
import com.homework.board.model.service.BoardService;
import com.homework.board.model.service.BoardServiceImpl;

public class BoardView {
	
	private BufferedReader br = null;
	private BoardService service = null;
	
	public BoardView() {
		
		try {
			
			service = new BoardServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void startDisplay() throws Exception{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 0;
		
		do {
			
			try {
				
				System.out.println("=========== 나만의 게시판 ===========");
				System.out.println("1. 전체 게시글 보기");
				System.out.println("2. 게시글 작성하기");
				System.out.println("3. 인기순으로 보기");
				System.out.println("4. 최신순으로 보기");
				System.out.println("5. 게시글 상세히 보기");
				System.out.println("6. 게시글 추천하기");
				System.out.println("7. 게시글 비추천하기");
				System.out.println("8. 게시글 수정하기");
				System.out.println("9. 게시글 삭제하기");
				System.out.println("0. 게시판 나가기");
				System.out.print("메뉴 입력 >>> ");
				input = Integer.parseInt(br.readLine());
				
				switch(input) {
				case 1 : boardView(); break;
				case 2 : addBoard(); break;
				case 3 : sortByBest(); break;
				case 4 : sortByTime(); break;
				case 5 : boardDetail(); break;
				case 6 : boardUp(); break;
				case 7 : boardDown(); break;
				case 8 : boardUpdate(); break;
				case 9 : boardDelet(); break;
				case 0 : System.out.println("게시판을 나갑니다.."); break;
				default : System.out.println("잘못 입력하셨습니다.");
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(input != 0);
		
	}
	
	/**
	 * 전체 게시글 보기
	 */
	public void boardView() {
		
		System.out.println("\n============================ 전체 게시글 ============================\n");
		
		List<Board> boardList = service.boardView();  
		
		int count = 1;
		
		for(Board board : boardList) {
			System.out.printf(count++ + ". %-20s - [ %s ]         조회수 : %d / 추천 : %d / 비추천 : %d\n",board.getTitle(), board.getWirter(), board.getVisite(), board.getUp(), board.getDown());

		}
		
		
	}
	
	
	public void addBoard() throws Exception {
		System.out.println("\n============================ 게시글 작성하기 ============================\n");
		
		System.out.print("제목 : ");
		String title = br.readLine();
		
		System.out.print("작성자(익명) : ");
		String writer = br.readLine();
		
		System.out.print("내용( 내용을 마무리 하려면 ' !end@ ' 입력 ) : ");
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String content = br.readLine();
			
			if(content.equals("!end@")) break;
			
			sb.append(content).append("\n");
			
		}
		
		service.addBoard(title, writer, sb.toString());
		
		
		System.out.println("====================== 게시글을 작성했습니다!!!! ======================");
		
		
	}
	
	
	/**
	 * 인기순으로 보기
	 */
	public void sortByBest() {
		
		System.out.println("\n============================ 인기 게시글 ============================\n");
		
		List<Board> boardList = service.boardView();
		
		List<Board> copyList = new ArrayList<Board>();
		
		copyList.addAll(boardList);
		
		copyList.sort(Comparator.comparing(Board::getUp).reversed());
		
		int count = 1;
		
		for(Board board : copyList) {
			System.out.printf(count++ + ". %-20s 조회수 : %d / 추천 : %d / 비추천 : %d\n",board.getTitle(), board.getVisite(), board.getUp(), board.getDown());
		}
		
	}
	
	/**
	 * 최신순으로 보기
	 */
	public void sortByTime() {
		
		System.out.println("\n============================ 최신 게시글 ============================\n");
		
		List<Board> boardList = service.boardView();
		
		List<Board> copyList = new ArrayList<Board>();
		
		copyList.addAll(boardList);
		
		copyList.sort(Comparator.comparing(Board::getRegDate).reversed());
		
		int count = 1;
		
		for(Board board : copyList) {
			System.out.printf(count++ + ". %-20s 조회수 : %d / 추천 : %d / 비추천 : %d\n",board.getTitle(), board.getVisite(), board.getUp(), board.getDown());
		}
		
	}
	
	
	/**
	 * 게시글 내용 보기
	 * @throws IOException 
	 */
	public void boardDetail() throws Exception {
		
		System.out.println("\n============================ 게시글 내용 보기 ============================\n");
		
		System.out.print("조회하실 게시글 제목을 입력해주세요 : ");
		String title = br.readLine();
		
		String detail = service.boardDetail(title);
		
		if(detail != null) {
			
			System.out.printf("\n============================ %s ============================\n",title);
			
			System.out.println("\n" + detail + "\n");
			
		}
		
		else {
			System.out.println("======== 입력하신 제목이 존재하지 않습니다.========");
		}
	}
	
	
	/**
	 * 추천하기
	 * @throws IOException 
	 */
	public void boardUp() throws Exception {
		
		System.out.println("\n+++++++++++++++ 게시글 추천하기 +++++++++++++++\n");
		
		System.out.print("추천하실 게시글 제목을 입력해주세요 : ");
		String title = br.readLine();
		
		boolean result =  service.boardUp(title);
		
		if(!result) {
			System.out.println("\n======== 입력하신 제목이 존재하지 않습니다.========\n");
			return;
		}
		
		System.out.println("\n============== [추천 완료] ==============\n");
		
	}
	
	
	/**
	 * 비추천하기
	 * @throws IOException
	 */
	public void boardDown() throws Exception {
		
		System.out.println("\n+++++++++++++++ 게시글 비추천하기 +++++++++++++++\n");
		
		System.out.println("비추천하실 게시글 제목을 입력해주세요 : ");
		
		String title = br.readLine();
		
		boolean result = service.boardDown(title);
		
		if(!result) {
			System.out.println("\n======== 입력하신 제목이 존재하지 않습니다.========\n");
			return;
		}
		
		System.out.println("\n============== [비추천 완료] ==============\n");
	}
	
	
	/**
	 * 게시글 수정하기
	 * @throws IOException 
	 */
	public void boardUpdate()throws Exception {
		
		System.out.println("\n+++++++++++++++ 게시글 수정하기 +++++++++++++++\n");
		
		System.out.print("수정하고싶은 게시글 제목을 입력해주세요 : ");
		String title = br.readLine();
		
		Board titleCheck = service.titleCheck(title);
		
		if(titleCheck == null) {
			System.out.println("\n======== 입력하신 제목이 존재하지 않습니다.========\n");
			return;
		}
		
		System.out.print("\n[수정 후 게시글 제목] : ");
		String updateTitle = br.readLine();
		
		System.out.println("\n[수정 하실 내용] (수정을 마무리 하시려면 ' !end@ ' 라고 입력해주세요 : ");
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String content = br.readLine();
			
			if(content.equals("!end@")) break;
			
			sb.append(content).append("\n");
			
		}
		
		service.boardUpdate(title, updateTitle, sb.toString());
		
		System.out.println("\n============== [수정 완료] ==============\n");
		
		
		
	}
	
	
	
	/**
	 * 게시글 삭제
	 * @throws IOException 
	 */
	public void boardDelet() throws Exception {
		
		System.out.println("\n+++++++++++++++ 게시글 삭제하기 +++++++++++++++\n");
		
		System.out.print("삭제하실 게시글 제목을 입력해주세요");
		String title = br.readLine();
		
		boolean delete = service.boardDelete(title);
		
		if(delete) { // 제목이 없을때
			System.out.println("\n======== 입력하신 제목이 존재하지 않습니다.========\n");
			return;
		}
		
		System.out.println("\n============== [삭제 완료] ==============\n");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
