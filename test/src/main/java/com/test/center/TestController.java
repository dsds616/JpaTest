package com.test.center;

import com.test.domain.board.BoardRepository;
import com.test.service.JpaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class TestController {

    @Resource JpaTestService jpaTestService;

    @RequestMapping("home")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();

        mav.addObject("test", "배고프다");
        mav.addObject("boards", jpaTestService.getBoardList());

        jpaTestService.jpaTest();

        return mav;
    }

}
