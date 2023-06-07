package com.lec.repository;

import org.springframework.data.repository.CrudRepository;

import com.lec.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

	
}
