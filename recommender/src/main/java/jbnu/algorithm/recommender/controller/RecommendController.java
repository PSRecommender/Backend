package jbnu.algorithm.recommender.controller;

import jbnu.algorithm.recommender.vo.recommendVO;
import jbnu.algorithm.recommender.vo.userVO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import jbnu.algorithm.recommender.service.recommendSerivce;

@Controller
@RequestMapping("")
public class RecommendController {
    @Autowired
    recommendSerivce service;

    @RequestMapping(value = "recommend", method= RequestMethod.POST)
    @ResponseBody
    public recommendVO recommend(@RequestBody userVO user) throws Exception {
        return service.recommend(user);
    }

    @RequestMapping(value="crawling", method = RequestMethod.GET)
    @ResponseBody
    public Boolean validation( @RequestParam String userId)throws Exception{
        String url = "https://www.acmicpc.net/user/" + userId;
        Document doc;
        try{
            doc = Jsoup.connect(url).get();
        }catch(Exception e){
            return false;
        }
        return true;
    }

}
