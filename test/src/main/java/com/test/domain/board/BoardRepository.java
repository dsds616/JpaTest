package com.test.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<BoardVo, Long>, BoardRepositoryCustom {
    List<BoardVo> findByTitleContains(String title);
}
