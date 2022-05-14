package jbnu.algorithm.recommender.controller;

import jbnu.algorithm.recommender.vo.problemVO;
import jbnu.algorithm.recommender.vo.recommendVO;
import jbnu.algorithm.recommender.vo.userVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("")
public class RecommendController {
    @RequestMapping(value = "recommend", method= RequestMethod.POST)
    @ResponseBody
    public recommendVO recommend(@RequestBody userVO user){
        recommendVO recommend = new recommendVO();
        recommend.setUser(user);
        problemVO problem1 = new problemVO();
        problemVO problem2 = new problemVO();
        problem1.setId("1234");
        problem1.setTag("수학");
        problem1.setLevel("GOLD1");
        problem2.setId("1234");
        problem2.setTag("수학");
        problem2.setLevel("GOLD1");
        ArrayList<problemVO> problemList = new ArrayList<>();
        problemList.add(problem1);problemList.add(problem2);
        recommend.setProblemList(problemList);
        return recommend;
    }

}
