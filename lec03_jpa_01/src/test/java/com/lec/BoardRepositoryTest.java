package com.lec;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lec.domain.Board;
import com.lec.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {

	@Autowired // new BoardRepository() 수동생성대신에 자동생성후 주입
	private BoardRepository boardRepo;
	
	@Test
	public void testInsertBoard() {
		Board board = new Board();
		board.setTitle("첫 번째 게시글");
		board.setWriter("테스터");
		board.setContent("잘 동작이 될까");
		board.setCreateDate(new Date());
		board.setCnt(1L);
		boardRepo.save(board); // insert into board...

	}
//	
//	@Test
//	public void testGetBoard() {
//		Board board = boardRepo.findById(2L).get();
//		System.out.println(board);
//	}
	
//	@Test
//	public void testUpdateBoard() {
//		System.out.println("=== 2번글 조회 ===");
//		Board board = boardRepo.findById(2L).get();
//		
//		System.out.println("=== 2번글 제목 수정 ===");
//		board.setTitle("제목을 크리스탈했습니다.");
//		boardRepo.save(board);
//		System.out.println(boardRepo.findById(2L).get());
//	}
	
//	@Test
//	public void testDeleteBoard() {
//		boardRepo.deleteById(2L);
//	}
	
	@Test
	public void testGetBoardList() {
	    Iterable<Board> boardList = boardRepo.findAll();
	    
	    System.out.println("==> " + boardList.iterator().toString());
	    
	    for (Board board : boardList) {
	        System.out.println(board);
	    }
	}

}

