package jbnu.algorithm.recommender.service;

import jbnu.algorithm.recommender.vo.problemVO;
import jbnu.algorithm.recommender.vo.recommendVO;
import jbnu.algorithm.recommender.vo.userVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class recommendServiceImpl implements recommendSerivce {
    @Override
    public recommendVO recommend(userVO user) throws Exception {
        ArrayList<problemVO> problemList = getRecommend(user.getId());
        recommendVO recommend = new recommendVO();
        recommend.setUser(user);
        recommend.setProblemList(problemList);
        return recommend;
    }

    @Override
    public ArrayList<problemVO> getRecommend(String userId) throws Exception {
        ArrayList<problemVO> problemList = new ArrayList<>();
        problemVO problem1 = new problemVO();
        problemVO problem2 = new problemVO();
        problem1.setId("1234");
        problem1.setTag("수학");
        problem1.setLevel("GOLD1");
        problem2.setId("1234");
        problem2.setTag("수학");
        problem2.setLevel("GOLD1");
        problemList.add(problem1);
        problemList.add(problem2);
        return problemList;
    }

    @Override
    public boolean validation(String userId) throws Exception {
        return false;
    }


}
