package jbnu.algorithm.recommender.service;

import jbnu.algorithm.recommender.vo.problemVO;
import jbnu.algorithm.recommender.vo.recommendVO;
import jbnu.algorithm.recommender.vo.userVO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:5000";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        Map<String,String> body = new HashMap<>();
        body.put("uId", userId);

        HttpEntity<?> requestMessage = new HttpEntity<>(body, httpHeaders);

        HttpEntity<ArrayList> response = restTemplate.postForEntity(url, requestMessage, ArrayList.class);

        ArrayList<problemVO> problemList = response.getBody();
//        for(String s : arr){
//            problemVO problemVO = new problemVO();
//            problemVO.setId(s);
//            problemVO.setTag("BFS");
//            problemVO.setLevel("GOLD1");
//            problemList.add(problemVO);
//        }

//        ArrayList<problemVO> problemList = new ArrayList<>();
//        problemVO problem1 = new problemVO();
//        problemVO problem2 = new problemVO();
//        problem1.setId("1234");
//        problem1.setTag("수학");
//        problem1.setLevel("GOLD1");
//        problem2.setId("1234");
//        problem2.setTag("수학");
//        problem2.setLevel("GOLD1");
//        problemList.add(problem1);
//        problemList.add(problem2);
        return problemList;
    }

    @Override
    public boolean validation(String userId) throws Exception {
        return false;
    }


}
