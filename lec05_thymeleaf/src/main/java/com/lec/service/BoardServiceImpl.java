package com.lec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.domain.Board;
import com.lec.persistence.BoardRepository;
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository boardRepository;
	@Override
	public List<Board> getBoardList(Board board) {
		// TODO Auto-generated method stub
		return (List<Board>) boardRepository.findAll();
	}
	@Override
	public Board getBoard(Board board) {
		// TODO Auto-generated method stub
		return boardRepository.findById(board.getSeq()).get();
	}
	
	public void updateBoard(Board board) {
	Board findBoard = boardRepository.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepository.save(findBoard);
	}
	@Override
	public void insertBoard(Board board) {
		boardRepository.save(board);
		
	}
	@Override
	public void deleteBoard(Board board) {
		boardRepository.deleteById(board.getSeq());
		
	}

}
