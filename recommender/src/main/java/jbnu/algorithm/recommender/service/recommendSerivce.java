package jbnu.algorithm.recommender.service;

import jbnu.algorithm.recommender.vo.problemVO;
import jbnu.algorithm.recommender.vo.recommendVO;
import jbnu.algorithm.recommender.vo.userVO;

import java.util.ArrayList;

public interface recommendSerivce {
    public recommendVO recommend(userVO user) throws Exception;

    public ArrayList<problemVO> getRecommend(String userId) throws Exception;

    public boolean validation(String userId) throws Exception;

}
