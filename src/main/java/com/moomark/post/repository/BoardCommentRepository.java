package com.moomark.post.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.moomark.post.domain.Board;
import com.moomark.post.domain.BoardComment;

public interface BoardCommentRepository extends JpaRepository<BoardComment, Long> {
  List<BoardComment> findByBoard(Board board);

  Page<BoardComment> findByBoard(Board board, Pageable pageAble);
}
