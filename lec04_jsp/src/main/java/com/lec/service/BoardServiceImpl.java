package com.lec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.domain.Board;
import com.lec.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	public List<Board> getBoardList(Board board) {
		return (List<Board>) boardRepository.findAll(); 
	}

	@Override
	public void insertBoard(Board board) {
		boardRepository.save(board);
	}
	
	@Override
	public Board getBoard(Board board) {
		return boardRepository.findById(board.getSeq()).get();
	}
	
	@Override
	public void updateBoard(Board board) {
		
		Board findBoard = boardRepository.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		findBoard.setWriter(board.getWriter());
		boardRepository.save(findBoard);
	}

	@Override
	public void deleteBoard(Board board) {
		boardRepository.deleteById(board.getSeq());
		
	}
}
