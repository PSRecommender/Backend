package jbnu.algorithm.recommender.vo;
import java.util.*;

public class recommendVO {
    private userVO user;
    private ArrayList<problemVO> problemList;

    public userVO getUser() {
        return user;
    }

    public void setUser(userVO user) {
        this.user = user;
    }

    public ArrayList<problemVO> getProblemList() {
        return problemList;
    }

    public void setProblemList(ArrayList<problemVO> problemList) {
        this.problemList = problemList;
    }
}
