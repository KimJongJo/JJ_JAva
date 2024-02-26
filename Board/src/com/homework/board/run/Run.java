package com.homework.board.run;

import com.homework.board.view.BoardView;

public class Run {
	public static void main(String[] args) throws Exception{
		
		System.out.println(" ============= 프로그램 시작 =============");		
		BoardView view = new BoardView();
		
		view.startDisplay();
	}
}
