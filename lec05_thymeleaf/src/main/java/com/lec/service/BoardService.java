package com.lec.service;

import java.util.List;

import com.lec.domain.Board;

public interface BoardService {

	List<Board> getBoardList(Board board);

	Board getBoard(Board board);

	void updateBoard(Board board);

	void insertBoard(Board board);

	void deleteBoard(Board board);
	
}
