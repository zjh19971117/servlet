package dao.impl;

import dao.UsersDao;
import entity.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDaoImpl implements UsersDao {
    Statement sta=null;
    Connection connection;
    ResultSet res;
    @Override
    public List<Users> selectAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from users where 1=1";
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day1?characterEncoding=utf8", "root", "123456");
             sta = connection.createStatement();
             res = sta.executeQuery(sql);

            List ulist = new ArrayList();
            while (res.next()) {
                Users users = new Users();
                users.setUid(res.getInt(1));
                users.setUname(res.getString(2));
                users.setUpass(res.getString(3));
                users.setUemail(res.getString(4));
                users.setUgender(res.getString(5));
                ulist.add(users);
            }
            return ulist;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                res.close();
                sta.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
