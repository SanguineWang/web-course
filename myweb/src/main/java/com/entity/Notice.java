package com.entity;

import javax.xml.crypto.Data;
import java.sql.Timestamp;

public class Notice {
    private  int id;
    private  String title;
    private  String content;
    private String time;

    public Notice(int id, String title,String content,String time ){
        this.id=id;
        this.time=time;
        this.title=title;
        this.content=content;
    }
    public Notice(int id, String title,String content ){
        this.id=id;
        this.title=title;
        this.content=content;
    }
    public Notice( String title,String content ){
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
}
