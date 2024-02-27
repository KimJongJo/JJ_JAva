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

	/**
	 * 목록에 입력한 제목이 있는지 확인
	 * @param title
	 * @return
	 */
	Board titleCheck(String title);

	/** 
	 * 게시물 삭제
	 * @param title
	 * @return
	 * @throws Exception
	 */
	boolean boardDelete(String title) throws Exception;

	/**
	 * 게시물 추가
	 * @param title
	 * @param writer
	 * @param content
	 * @throws Exception
	 */
	void addBoard(String title, String writer, String content) throws Exception;

}
