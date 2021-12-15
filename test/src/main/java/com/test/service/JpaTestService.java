package com.test.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.test.domain.board.BoardRepository;
import com.test.domain.board.BoardRepositoryCustom;
import com.test.domain.board.BoardRepositoryImpl;
import com.test.domain.board.BoardVo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class JpaTestService {

    @Resource private BoardRepository boardRepository;
    @Resource private BoardRepositoryImpl boardRepositoryImpl;

    private JPAQueryFactory jpaQueryFactory;

    public void jpaTest() {
        List<BoardVo> boards = boardRepository.findByTitleContains("페이지네이션");
        System.out.println(boards);

        BoardVo testBoard = boardRepository.findById(58L).get();
        System.out.println(testBoard);
    }

    public List<BoardVo> getBoardList(){
        BoardVo board = new BoardVo();
        board.setDelYn("N");
        System.out.println(boardRepositoryImpl.findDelYn(board));

        return boardRepository.findAll(Sort.by(Sort.Direction.DESC, "regDtime"));
    }

    public void queryDslTest() {


        BoardVo testBoard = boardRepository.findById(58L).get();
        System.out.println(testBoard);
    }

}
