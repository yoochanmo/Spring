package com.lec.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Entity
@ToString
public class Member {
	
	@Id
	private String id;
	private String password;
	private String name;
	private String role;

}
