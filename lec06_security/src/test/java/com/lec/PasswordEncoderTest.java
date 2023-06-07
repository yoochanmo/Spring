package com.lec;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import com.lec.domain.Member;
import com.lec.domain.Role;
import com.lec.repository.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class PasswordEncoderTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Test
	public void testInsert() {
		Member member = new Member();
		member.setId("hong");
		member.setPassword(encoder.encode("12345"));
		member.setName("홍길동");
		member.setRole(Role.ROLE_MANAGER);
		member.setEnabled(true);
		memberRepository.save(member);
	}
}
