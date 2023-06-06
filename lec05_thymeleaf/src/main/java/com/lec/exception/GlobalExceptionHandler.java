package com.lec.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice // 컨트롤러에서 발생하는 모든 예외를 처리하라는 의미
public class GlobalExceptionHandler {

	@ExceptionHandler(BoardException.class)
	public String handleCustomException(BoardException exception, Model model){
		model.addAttribute("exception", exception);
		return "/errors/boarderror";
	}
	@ExceptionHandler(Exception.class)
	public String handleException(Exception exception, Model model){
		model.addAttribute("exception", exception);
		return "/errors/globalerror";
	}
}
