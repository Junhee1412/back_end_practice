package com.lec.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.lec.domain.Board;
import com.lec.domain.Member;

public interface BoardRepository extends CrudRepository<Board, Long> {

    Page<Board> findByTitleContaining(String title, Pageable pageable);
    Page<Board> findByWriterContaining(String writer, Pageable pageable);
    Page<Board> findByContentContaining(String content, Pageable pageable);
}
