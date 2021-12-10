package com.test.domain.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name="board_test") // 엔티티의 이름은 JQL에서 사용
@Table(name="BOARD")  // 테이블의 이름은 SQL에서 사용
@NoArgsConstructor
@AllArgsConstructor
public class BoardVo {

    @Id
    @Column(name="BOARD_ID", nullable = false, length = 20)
    private Long boardId;

    @Column(name="TITLE")
    private String title;

    @Column(name="CONTENT")
    private String content;

    @Column(name="STATUS")
    private Long status;

    @Column(name="REG_DTIME")
    private Date regDtime;

    @Column(name="UPDATE_DTIME")
    private Date updateDtime;

    @Column(name="MAJOR_YN")
    private String majorYn;

    @Column(name="RESV_YN")
    private String resvYn;

    @Column(name="PUB_DTIME")
    private Date pubDtime;

    @Column(name="BOARD_STATUS_CODE")
    private String boardStatusCode;

    @Column(name="DEL_YN")
    private String delYn;

    @Column(name="CLICK_CNT")
    private Long clickCnt;

    @Transient // 컬럼으로 매칭 안 함.
    private Long viewCnt;
}
