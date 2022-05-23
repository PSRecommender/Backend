package jbnu.algorithm.recommender.vo;

import java.util.ArrayList;

public class problemVO {
    private String pId;
    private ArrayList<tagVO> tags;
    private String level;
    private String url;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public ArrayList<tagVO> getTags() {
        return tags;
    }

    public void setTags(ArrayList<tagVO> tags) {
        this.tags = tags;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
