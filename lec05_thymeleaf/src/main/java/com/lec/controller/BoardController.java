package com.lec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lec.domain.Board;
import com.lec.domain.Member;
import com.lec.service.BoardService;

@Controller
@SessionAttributes("member")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/getBoardList")
	private String getBoardList(@ModelAttribute("member") Member member, Model model, Board board) {
		
		if(member.getId() == null) {
			return "redirect:login";
		}
		List<Board> boardList = boardService.getBoardList(board);
		model.addAttribute("boardList",boardList);
		return "getBoardList";
	}
	
	@GetMapping("/getBoard")
public String getBoard(@ModelAttribute("member") Member member, Model model, Board board) {
	if(member.getId() == null) {
		return "redirect:login";
	}
	model.addAttribute("board", boardService.getBoard(board));
	return "getBoard";

}
	
	@PostMapping("/updateBoard")
	public String updateBoard(@ModelAttribute("member") Member member, Board board) {
		if(member.getId() == null) {
			return "redirect:login";
		}

		boardService.updateBoard(board);
		return "forward:getBoardList";
	}
	
	@GetMapping("/insertBoard")
	public String insertBoardView(@ModelAttribute("member") Member member) {
		if(member.getId() == null) {
			return "redirect:login";
		}
		return "insertBoard";

	}
	@PostMapping("/insertBoard")
	public String insertBoard(@ModelAttribute("member") Member member, Board board) {
		
		if(member.getId() == null) {
			return "redirect:login";
		}
		
		boardService.insertBoard(board);
		return "redirect:getBoardList";
		
	}
	
	@GetMapping("/deleteBoard")
	public String deleteBoard(@ModelAttribute("member") Member member, Board board) {
		if(member.getId() == null) {
			return "redirect:login";
		}
		boardService.deleteBoard(board);
		return "forward:getBoardList";
	}
}
