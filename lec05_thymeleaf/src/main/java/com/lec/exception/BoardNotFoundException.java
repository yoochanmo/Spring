package com.lec.exception;

public class BoardNotFoundException  extends RuntimeException{

	public BoardNotFoundException(String message) {
		super(message);
	}
}
