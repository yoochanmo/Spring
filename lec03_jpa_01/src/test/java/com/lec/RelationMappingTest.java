package com.lec;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lec.domain.Board;
import com.lec.domain.Member;
import com.lec.persistence.BoardRepository;
import com.lec.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationMappingTest {

	@Autowired private BoardRepository boardRepository;
	@Autowired private MemberRepository memberRepository;
	
//	@Test
//	public void testManyToOneInsert() {
//		Member member1 = new Member();
//		member1.setId("hong");
//		member1.setPassword("12345");
//		member1.setName("홍길동");
//		member1.setRole("USER");
//		memberRepository.save(member1);
//		
//		Member member2 = new Member();
//		member2.setId("sonny");
//		member2.setPassword("12345");
//		member2.setName("손흥민");
//		member2.setRole("ADMIN");
//		memberRepository.save(member2);
//		
//		for(int i=1; i<=3; i++) {
//			Board board = new Board();
//			board.setMember(member1);
//			board.setTitle("길동이가 등록한 게시글" + i);
//			board.setContent("길동이가 등록한 게시글 상세내용" + i);
//			board.setCreateDate(new Date());
//			board.setCnt(0l);
//			boardRepository.save(board);
//		}
//		
//		for(int i=1; i<=3; i++) {
//			Board board = new Board();
//			board.setMember(member2);
//			board.setTitle("흥민이가 등록한 게시글" + i);
//			board.setContent("흥민이가 등록한 게시글 상세내용" + i);
//			board.setCreateDate(new Date());
//			board.setCnt(0l);
//			boardRepository.save(board);
//		}
//	}
	
//	@Test
//	public void testMantToOneSelect() {
//		Board board = boardRepository.findById(5L).get();
//		
//		System.out.println("[" + board.getSeq() + "번 게시글 조회하기 ]");
//		System.out.println(board.toString());
//	}
//	@Test
//	public void testOneToManySelect() {
//		Member member = memberRepository.findById("sonny").get();
//		
//		System.out.println("======================================================");
//		System.out.println(member.getName() + "가(이) 작성한 게시글 목록보기");
//		System.out.println("======================================================");
//		List<Board> boards = member.getBoardList();
//		for(Board board:boards) {
//			System.out.println(board.toString());
//		}
//	}
	
	@Test
	public void testCascadeDelete() {
		memberRepository.deleteById("hong");
	}
}
























