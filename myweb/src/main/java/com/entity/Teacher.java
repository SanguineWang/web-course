package com.entity;

public class Teacher {
    private String title;
    private int    titleid;
    private String name;
    private String intro;
    private int img;
    public  Teacher(String title,int titleid,String name,String intro,int img){
        this.title=title;
        this.intro=intro;
        this.titleid=titleid;
        this.name=name;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTitleid() {
        return titleid;
    }

    public void setTitleid(int titleid) {
        this.titleid = titleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
