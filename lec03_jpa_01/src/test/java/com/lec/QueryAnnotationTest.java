package com.lec;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.lec.domain.Board;
import com.lec.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryAnnotationTest {

	
	@Autowired
	private BoardRepository boardRepository;
	
//	@Test
//	public void testQueryAnnotationTest1() {
//		List<Board> boardList = boardRepository.queryAnnotation1("테스트 제목10");
//		
//		System.out.println("===> 검색결과 " );
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//	@Test
//	public void testQueryAnnotationTest2() {
//		List<Object[]> boardList = boardRepository.queryAnnotation2("테스트 제목10");
//		
//		System.out.println("===> 검색결과 " );
//		for(Object[] row:boardList) {
//			System.out.println("---> " + Arrays.toString(row));
//		}
//	}
//	@Test
//	public void testQueryAnnotationTest3() {
//		List<Object[]> boardList = boardRepository.queryAnnotation3("테스트 제목10");
//		
//		System.out.println("===> 검색결과 " );
//		for(Object[] row:boardList) {
//			System.out.println("---> " + Arrays.toString(row));
//		}
//	}
//	@Test
//	public void testQueryAnnotationTest4() {
//		Pageable paging = PageRequest.of(0, 3, Sort.Direction.DESC, "seq");
//		List<Board> boardList = boardRepository.queryAnnotation4(paging);
//		
//		System.out.println("===> 검색결과 " );
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
}
