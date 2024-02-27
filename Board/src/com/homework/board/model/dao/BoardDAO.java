package com.homework.board.model.dao;

import java.util.List;

import com.homework.board.model.dto.Board;

public interface BoardDAO {

	/**
	 * 전체 게시글
	 * @return
	 */
	List<Board> boardView();

	/**
	 * 게시글 내용
	 * @param title
	 * @return
	 * @throws Exception
	 */
	String boardDetail(String title) throws Exception;

	/**
	 * 게시글 추천
	 * @param title
	 * @return
	 * @throws Exception
	 */
	boolean boardUp(String title) throws Exception;

	/**
	 * 게시글 비추천
	 * @param title
	 * @return
	 * @throws Exception
	 */
	boolean boardDown(String title) throws Exception ;

	/**
	 * 게시글 수정
	 * @param title
	 * @param updateTitle
	 * @param content
	 * @throws Exception
	 */
	void boardUpdate(String title, String updateTitle, String content) throws Exception ;

	/**
	 * 목록에 제목이 있는지 확인
	 * @param title
	 * @return
	 */
	Board findTitle(String title);

	/**
	 * 게시글 삭제
	 * @param title
	 * @return
	 * @throws Exception
	 */
	boolean boardDelete(String title) throws Exception ;

	/**
	 * 게시글 작성
	 * @param title
	 * @param writer
	 * @param content
	 * @throws Exception
	 */
	void addBoard(String title, String writer, String content) throws Exception ;

}
