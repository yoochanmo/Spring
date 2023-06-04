package com.lec.persistence;

import org.springframework.data.repository.CrudRepository;

import com.lec.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
