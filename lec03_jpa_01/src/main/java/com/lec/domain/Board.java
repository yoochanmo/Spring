package com.lec.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "member")
@Entity
public class Board {

	@Id	                  // primary key
	@GeneratedValue       // pk 자동생성(일련번호) int로 주면 에러    
	private long seq;
	private String title;
	private String writer;
	private String content;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;
	private long cnt;
	

	@ManyToOne
	@JoinColumn(name="Member_ID", nullable = false)
	private Member member;
	
	public void setMember(Member member) {
		this.member = member;
		member.getBoardList().add(this);

	}
	
	
	
}
