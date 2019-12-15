package com.service.impl;

import com.entity.News;
import com.entity.Notice;
import com.entity.User;
import com.service.UserService;
import com.util.DataSourceUtils;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
    @Override
    public User getUser(String id) {
        String sql = "SELECT * FROM webtest.user WHERE id=?";
        User user = null;
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, id);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                 user=new User( rs.getString("id"),rs.getString("key"),rs.getInt("isadmin"));
                         }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return user;
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO webtest.user(id, key) VALUES(?,?)";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, user.getId());
            st.setString(2,user.getKey());
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    @Override
    public List<News> getNews() {
        String sql = "SELECT * FROM webtest.news";
        List<News> newsList= new ArrayList<>();
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    News news = new News(rs.getInt("idnews"), rs.getString("title"), rs.getString("content"), rs.getString("time"), rs.getString("image"));
                    newsList.add(news);
                    }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return newsList.stream().sorted(Comparator.comparing(News::getTime).reversed()).collect(Collectors.toList());
    }

    @Override
    public List<Notice> getNotice() {
        String sql = "SELECT * FROM webtest.notice";
        List<Notice> noticeList=new ArrayList<>();
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Notice notice = new Notice(rs.getInt("idnotice"), rs.getString("title"), rs.getString("content"),  rs.getString("time"));
                    noticeList.add(notice);
                }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return noticeList.stream().sorted(Comparator.comparing(Notice::getTime).reversed()).collect(Collectors.toList());
    }



    @Override
    public void addNews(News news) {
        String sql = "INSERT INTO webtest.news(title ,content) VALUES(?,?)";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
//            st.setInt(1, news.getId());
            st.setString(1, news.getTitle());
            st.setString(2, news.getContent());
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    @Override
    public void addNotice(Notice notice) {
        String sql = "INSERT INTO webtest.notice(title ,content) VALUES(?,?)";
        try(
             Connection conn = DataSourceUtils.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
//             st.setInt(1, notice.getId());
             st.setString(1, notice.getTitle());
             st.setString(2, notice.getContent());
             st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    @Override
    public List<News> findNews(String parttitle) {
        String sql = "SELECT * FROM webtest.news where title like '%?%'";
        List<News> newsList= new ArrayList<>();
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, parttitle);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    News news = new News(rs.getInt("idnews"), rs.getString("title"), rs.getString("content"),  rs.getString("time"), rs.getString("image"));
                    newsList.add(news);
                }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return newsList;
    }

    @Override
    public List<Notice> findNotice(String parttitle) {
        String sql = "SELECT * FROM webtest.notice where title like '%?%'";
        List<Notice> noticeList=new ArrayList<>();
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, parttitle);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Notice notice = new Notice(rs.getInt("idnotice"), rs.getString("title"), rs.getString("content"),  rs.getString("time"));
                    noticeList.add(notice);
                }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return noticeList;
    }

    @Override
    public News idGetNews(int id) {
        String sql = "SELECT * FROM webtest.news WHERE idnews=?";
        News news = null;
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            try(ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    news = new News(rs.getInt("idnews"), rs.getString("title"), rs.getString("content"),  rs.getString("time"), rs.getString("image"));     }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return news;
    }

    @Override
    public Notice idGetNotice(int id) {
        String sql = "SELECT * FROM webtest.notice WHERE idnotice=?";
        Notice notice = null;
        try (Connection conn = DataSourceUtils.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                     notice = new Notice(rs.getInt("idnotice"), rs.getString("title"), rs.getString("content"),  rs.getString("time"));
                }
            }
        } catch (SQLException e) {
            logger.warning(e.getMessage());
        }
        return notice;
    }

    @Override
    public void deleteNews(int id) {
        String sql = "delete from webtest.news where idnews=(?)";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    @Override
    public void deleteNotice(int id) {
        String sql = "delete from webtest.notice where idnotice=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setInt(1, id);
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

    @Override
    public void updateNews(News news) {
        String sql = "update  webtest.news set title=? , content=? where idnews=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1,news.getTitle());
            st.setString(2,news.getContent());
            st.setInt(3, news.getId());
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }
    @Override
    public void updateNotice(Notice notice) {
        String sql = "update  webtest.notice set title=? , content=? where idnotice=?";
        try(Connection conn = DataSourceUtils.getConnection();
            PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1,notice.getTitle());
            st.setString(2,notice.getContent());
            st.setInt(3, notice.getId());
            st.executeUpdate();
        }catch (SQLException e) {
            logger.warning(e.getMessage());
        }
    }

}
