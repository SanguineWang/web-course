package com.entity;

import javax.xml.crypto.Data;
import java.sql.Timestamp;

public class News{
    private int id;
    private  String title;
    private  String content;
    private String time;
    private  String image;


    public News(int id, String title,String content,String time,String image ){
        this.id=id;
        this.time=time;
        this.title=title;
        this.content=content;
        this.image=image;
    }
    public News(int id, String title,String content,String image ){
        this.id=id;
        this.title=title;
        this.content=content;
        this.image=image;
    }
    public News(int id, String title,String content ){
        this.id=id;
        this.title=title;
        this.content=content;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
