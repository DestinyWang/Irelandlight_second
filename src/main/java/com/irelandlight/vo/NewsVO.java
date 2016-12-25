package com.irelandlight.vo;

/**
 * Created by mr.w on 2016/12/18.
 */
public class NewsVO {
    private String newsContent;
    private String newsTitle;
    private String newsProductorName;

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsProductorName() {
        return newsProductorName;
    }

    public void setNewsProductorName(String newsProductorName) {
        this.newsProductorName = newsProductorName;
    }

    @Override
    public String toString() {
        return "NewsVO{" +
                "newsContent='" + newsContent + '\'' +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsProductorName='" + newsProductorName + '\'' +
                '}';
    }
}
