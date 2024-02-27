package com.homework.board.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.homework.board.model.dao.BoardDAO;
import com.homework.board.model.dao.BoardDAOImpl;
import com.homework.board.model.dto.Board;

public class BoardServiceImpl implements BoardService{
	
	private BoardDAO dao = null;

	
	public BoardServiceImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		
		dao = new BoardDAOImpl();
	}

// 게시글 전체 조회
	@Override
	public List<Board> boardView() {
		
		List<Board> boardList = dao.boardView();
		
		return boardList;
	}

// 게시글 내용 보기
	@Override
	public String boardDetail(String title) throws Exception{
		
		String detail = dao.boardDetail(title);
		
		return detail;
	}

// 게시글 추천하기
	@Override
	public boolean boardUp(String title) throws Exception{
		
		boolean result = dao.boardUp(title);
		
		return result;
	}

// 게시글 비추천하기
	@Override
	public boolean boardDown(String title) throws Exception{
	
		boolean result = dao.boardDown(title);
		
		return result;
	}

// 게시글 수정
	@Override
	public void boardUpdate(String title, String updateTitle, String content) throws Exception{
		
		dao.boardUpdate(title,updateTitle, content);
		
	}
	
// 목록에 제목이 있는지 확인
	@Override
	public Board titleCheck(String title) {
		
		Board titleCheck = dao.findTitle(title);
		
		return titleCheck;
	}

// 게시글 삭제
	@Override
	public boolean boardDelete(String title) throws Exception{
		
		boolean delete = dao.boardDelete(title);
		
		return delete;
	}

// 게시물 작성
	@Override
	public void addBoard(String title, String writer, String content)  throws Exception {
		
		dao.addBoard(title, writer, content);
		
	}
}
