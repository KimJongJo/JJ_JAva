package com.homework.board.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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

	public void startDisplay() {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = 0;
		
		do {
			
			try {
				
				System.out.println("=========== 나만의 게시판 ===========");
				System.out.println("1. 인기 게시글 보기");
				System.out.println("2. 전체 게시글 보기");
				System.out.println("3. 게시글 상세히 보기");
				System.out.println("4. 게시글 추천하기");
				System.out.println("5. 게시글 비추천하기");
				System.out.println("6. 게시글 수정하기");
				System.out.println("7. 게시글 삭제하기");
				System.out.print("메뉴 입력 >>> ");
				input = Integer.parseInt(br.readLine());
				
				switch(input) {
				case 1 : bestBoard(); break;
				case 2 : allBoard(); break;
				case 3 : boardDetail(); break;
				case 4 : boardUp(); break;
				case 5 : boardDown(); break;
				case 6 : boardUpdate(); break;
				case 7 : boardDelet(); break;
				case 0 : System.out.println("게시판을 나갑니다.."); break;
				default : System.out.println("잘못 입력하셨습니다.");
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(input != 0);
		
	}
	
}
