package com.lec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.domain.Member;
import com.lec.persistence.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public Member getMember(Member member) {
		Optional<Member> findMember = memberRepository.findById(member.getId());
		if(findMember.isPresent()) {
			return findMember.get();
		}else return null;
			
	}
}
