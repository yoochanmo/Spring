package com.lec;


import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.lec.domain.Board;
import com.lec.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryMethodTest {

	@Autowired
	private BoardRepository boardRepository;
	
//	@BeforeEach
//	public void dataPrepare() {
//		for(int i=1; i<=200;i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목" +  i);
//			board.setWriter("테스터");
//			board.setContent("잘 동작이 될까" + i);
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
//			boardRepository.save(board);
//		}
//	}

//	@Test
//	public void testFindByTitle() {
//		List<Board> boardList = boardRepository.findByTitle("테스트 제목10");
//		
//		System.out.println("===> 검색결과 " );
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
	
//	@Test
//	public void testFindByContentContaining() {
//		List<Board> boardList = boardRepository.findByContentContaining("17");
//		
//		System.out.println("===> 검색결과 " );
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//	@Test
//	public void testFindByTitleContainingOrContentContaining() {
//		List<Board> boardList = boardRepository.findByTitleContainingOrContentContaining("두","17");
//		
//		System.out.println("===> 검색결과 " );
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//	
	
//	@Test
//	public void testFindByTitleContainingOrderBySeqDesc() {
//		List<Board> boardList = boardRepository.findByTitleContainingOrderBySeqDesc("17");
//		
//		System.out.println("===> 검색결과 " );
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
	
//	@Test
//	public void testFindByTitleContaining() {
//		
//		// Pageable paging = PageRequest.of(0, 5); // limit 0, 5;
//		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq"); // order by seq desc limit 0, 5;
//		
//		List<Board> boardList = boardRepository.findByTitleContaining("제목", paging);
//		
//		System.out.println("===> 검색결과 " );
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
	@Test
	public void testFindByTitleContaining() {
		
		
		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq"); // order by seq desc limit 0, 5;
		Page<Board> pageInfo = boardRepository.findByTitleContaining("제목", paging);
		
		System.out.println("페이지사이즈 = " + pageInfo.getSize());
		System.out.println("총페이지수 = " + pageInfo.getTotalPages());
		System.out.println("총레코드수 = " + pageInfo.getTotalElements());
		System.out.println("다음페이지 = " + pageInfo.nextPageable());
		
		List<Board> boardList = pageInfo.getContent();
		
		
		System.out.println("===> 검색결과 " );
		for(Board board:boardList) {
			System.out.println("---> " + board.toString());
		}
	}
	
	
}
