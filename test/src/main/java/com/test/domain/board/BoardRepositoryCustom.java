package com.test.domain.board;

import com.querydsl.core.Tuple;

import java.util.List;

public interface BoardRepositoryCustom {

    List<Tuple> findDelYn(BoardVo vo);

}
