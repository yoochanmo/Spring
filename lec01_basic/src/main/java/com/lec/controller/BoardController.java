package com.lec.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lec.domain.BoardVo;

@RestController // @Controller + @ResponseBody
public class BoardController {

	// localhost:8088/getBoard
	@GetMapping("/getBoard")
	public BoardVo getBoard() {
		BoardVo board = new BoardVo();
		board.setSeq(1);
		board.setTitle("테스트제목...");
		board.setWriter("작성자...");
		board.setContent("테스트내용...");
		board.setCreateDate(new Date());
		board.setCnt(0);
		return board;
	}
	
	// Collection FrameWork
	@GetMapping("/getBoardList")
	public List<BoardVo>  getBoardList() {
		
		List<BoardVo> boardList = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			BoardVo board = new BoardVo();
			board.setSeq(1);
			board.setTitle("테스트제목...");
			board.setWriter("작성자...");
			board.setContent("테스트내용...");
			board.setCreateDate(new Date());
			board.setCnt(0);
			boardList.add(board);
		}
		
		return boardList;
	}
	
 }
