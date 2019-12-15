package com.service.impl;

import com.entity.User;
import com.service.UserService;
import com.util.DataSourseUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserServiceImpl implements UserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
    @Override
    public List<User> listUsers() {
        List<User> users= new ArrayList<>();
        String sql="SELECT * FROM User";
        try(Connection conn = DataSourseUtils.getConnection();//通过暴露的方法连接到数据库
            PreparedStatement prep= conn.prepareStatement(sql);//服务器缓存匹配字符串
            ResultSet res=prep.executeQuery();//查询结果返回到resultset
            ){
            while (res.next()){
                User user=new User(res.getInt("id"),res.getString("name"),res.getDate("inserttime"));
                users.add(user);
            }

        } catch (SQLException e) {
           logger.warning(e.getMessage());
        }


        return users;
    }

    @Override
    public void addUser(String name) {
      String sql="INSERT INTO user(name) VALUES(?)";
      try (Connection conn = DataSourseUtils.getConnection();//通过暴露的方法连接到数据库
           PreparedStatement prep= conn.prepareStatement(sql);//服务器缓存匹配字符串
      ){
       prep.setString(1,name);
       prep.executeUpdate();
      } catch (SQLException e) {
          logger.warning(e.getMessage());
      }
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }
}
