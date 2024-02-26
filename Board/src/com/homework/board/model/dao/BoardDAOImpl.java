package com.homework.board.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.homework.board.model.dto.Board;

public class BoardDAOImpl implements BoardDAO{
	
	private final String FILE_BOARD_PATH = "/io_test/Board.dat";
	
	private ObjectInputStream ois = null; // 객체 입력 스트림
	private ObjectOutputStream oos = null; // 객체 출력 스트림
	
	private List<Board> boardList = null; // 리스트 참조 변수
	
	public BoardDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File file = new File(FILE_BOARD_PATH);
		
		if(file.exists()) { // 파일이 존재하면
			
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_BOARD_PATH));
				
				boardList = (ArrayList<Board>)ois.readObject();
			} finally {
				
				if(ois != null) {
					ois.close();
				}
				
			}
			
		}else { // 파일이 존재하지 않으면 폴더 생성
			
			File directory = new File("/io_test");
			if(!directory.exists()) {
				directory.mkdir();
			}
			
			// 처음에 들어가 있는 게시물 작성
			
			boardList = new ArrayList<Board>();
			
			boardList.add(new Board("자바 공부 방법","고구마","1. 강의듣기\n2. 유튜브 따라하기\n3. 학원 등록하기", 123, 25, 3, LocalDateTime.now()));
			boardList.add(new Board("허리,목 아픈 사람 특징","감자","1. 다리를 자주 꼰다\n2. 허리를 구부정하게 하고다닌다\n3. 평소에 시선이 아래를 향하고 있다.", 50, 12, 2, LocalDateTime.now()));
			boardList.add(new Board("애국가 가사","독립운동가","동해물과 백두산이 마르고 닳도록\n하느님이 보우하사 우리나라 만세",500,251,0,LocalDateTime.now()));
			boardList.add(new Board("친구 사귀는 방법","뽀로로","새친구를 만날 수 있는 곳 찾기\n먼저 접근하기\n이미 알고있는 사람들에게 연락한다.",86,20,35,LocalDateTime.now()));
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_BOARD_PATH));
				oos.writeObject(boardList);
			}finally {
				
				if(oos != null) {
					oos.close();
				}
				
			}
			
			System.out.println("======= Board.dat 파일 생성 완료 =======");
			
		}
	}

	@Override
	public List<Board> boardView() {
		// TODO Auto-generated method stub
		
		return boardList;
	}
	
	
	
	public void saveFile()throws Exception {
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_BOARD_PATH));
			
			oos.writeObject(boardList);
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		}
		
	}
	
	@Override
	public void addBoard(String title, String writer, String content) throws Exception {
		
		boardList.add(new Board(title, writer, content, 0, 0, 0, LocalDateTime.now()));
		saveFile();
		
	}
	
	public Board findTitle(String title) {
		
		for(Board board : boardList) {
			if(title.equals(board.getTitle())) {
				return board;
			}
		}
		
		return null;
	}

	@Override
	public String boardDetail(String title) throws Exception {
		
		Board board = findTitle(title);
		
		if(board != null) {
			//조회수 1 증가
			int visite = board.getVisite();
			board.setVisite(++visite);
			
			saveFile();
			
			return board.getContent();
		}

		
		return null;
	}


	@Override
	public boolean boardUp(String title) throws Exception {
		
		Board board = findTitle(title);
		
		if(board != null) {
			int up = board.getUp();
			
			board.setUp(++up);
			
			saveFile();
			
			return true;
		}
		
		return false;
	}

	@Override
	public boolean boardDown(String title) throws Exception{
		
		Board board = findTitle(title);
		
		if(board != null) {
			int down = board.getDown();
			
			board.setDown(++down);
			
			saveFile();
			
			return true;
		}
		
		return false;
	}

	@Override
	public void boardUpdate(String title, String updateTitle, String content) throws Exception {
		
		Board board = findTitle(title);
		
		if(board == null) return;
		
		board.setTitle(updateTitle);
		board.setContent(content);
		saveFile();
	}

	@Override
	public boolean boardDelete(String title) throws Exception {
		
		Board board = findTitle(title);
		
		if(board == null) {
			return true;
		}
		
		int index = 0;
		
		for(Board bo : boardList) {
			if(title.equals(bo.getTitle())) {
				break;
			}
			
			index++;
		}
		
		boardList.remove(index);
		saveFile();
		
		return false;
	}



}
