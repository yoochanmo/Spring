package com.lec.domain;

import java.util.Date;

import lombok.Data;
import lombok.Getter;

@Data
public class BoardVo {

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate = new Date();
	private int cnt;

	
}
