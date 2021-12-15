package com.test.domain.board;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Tuple> findDelYn(BoardVo vo) {
        QBoardVo board = QBoardVo.boardVo;

        return jpaQueryFactory.select(board.title, board.delYn)
                .from(board)
                .where(
                    board.delYn.eq(vo.getDelYn())
            ).fetch();
    }
}
