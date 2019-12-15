package com.service;

import com.entity.News;
import com.entity.Notice;
import com.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 根据id得到用户
     * @param id
     * @return
     */
    public User getUser(String id);

    /**
     * 添加新用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 返回全部新闻 新插入的在前
     * @return
     */
    public List<News> getNews();

    /**
     * 返回全部新闻 新插入的在前
     * @return
     */
    public List<Notice> getNotice();


    /**
     * 添加，
     * 更新 如果之前有这个id就删掉旧的
     */
    public void  addNews(News news);
    public void  addNotice(Notice notice);
    /**查找，如果关键词是title的部分就返回
     * @param parttitle
     */
    public List<News>  findNews(String parttitle);
    public List<Notice>  findNotice(String parttitle);

    public News  idGetNews(int id);
    public Notice idGetNotice(int id);

    public void deleteNews(int id);
    public void deleteNotice(int id);
    public void updateNews(News news);
    public void updateNotice(Notice notice);

}
