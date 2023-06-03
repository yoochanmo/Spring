package com.lec.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lec.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

	List<Board> findByTitle(String searchWord);

	List<Board> findByContentContaining(String content);

	List<Board> findByTitleContainingOrContentContaining(String title, String content);

	List<Board> findByTitleContainingOrderBySeqDesc(String title);

//	List<Board> findByTitleContaining(String string, Pageable paging);
	Page<Board> findByTitleContaining(String string, Pageable paging);

//	@Query("select b from Board b " + "where b.title like %:searchKeyword% order by b.seq desc" )
//	List<Board> queryAnnotation1(@Param("searchKeyword") String word);
//
//	@Query("select b.seq, b.title, b.writer, b.createDate from Board b " + "where b.title like %:searchKeyword% " + " order by b.seq desc" )
//	List<Object[]> queryAnnotation2(@Param("searchKeyword") String string);
//
//	@Query(value = "select seq, title, writer, create_date from board " + " where title like '%'||?1||'%' order by seq desc", nativeQuery=true)
//	List<Object[]> queryAnnotation3(String searchKeyword);
//
//	@Query("select b from Board b")
//	List<Board> queryAnnotation4(Pageable paging);

	

	
}
