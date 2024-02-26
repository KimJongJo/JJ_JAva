package com.homework.board.model.service;

import java.util.List;

import com.homework.board.model.dto.Board;

public interface BoardService {

	/**
	 * 전체 게시글 조회
	 * @return
	 */
	List<Board> boardView();

	/**
	 * 게시글 내용
	 * @param title
	 * @return
	 */
	String boardDetail(String title) throws Exception;

	/**
	 * 게시글 추천
	 * @param title
	 * @return
	 */
	boolean boardUp(String title) throws Exception;

	/**
	 * 게시글 비추천
	 * @param title
	 * @return
	 */
	boolean boardDown(String title) throws Exception;

	/**
	 * 게시글 수정
	 * @param title
	 * @return
	 */
	void boardUpdate(String title, String updateTitle, String content) throws Exception;

	Board titleCheck(String title);

	boolean boardDelete(String title) throws Exception;

	void addBoard(String title, String writer, String content) throws Exception;

}
