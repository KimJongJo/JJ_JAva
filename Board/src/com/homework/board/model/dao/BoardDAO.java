package com.homework.board.model.dao;

import java.util.List;

import com.homework.board.model.dto.Board;

public interface BoardDAO {

	List<Board> boardView();

	String boardDetail(String title) throws Exception;

	boolean boardUp(String title) throws Exception;

	boolean boardDown(String title) throws Exception ;

	void boardUpdate(String title, String updateTitle, String content) throws Exception ;

	Board findTitle(String title);

	boolean boardDelete(String title) throws Exception ;

	void addBoard(String title, String writer, String content) throws Exception ;

}
