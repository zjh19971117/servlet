package dao;

import entity.Users;

import java.util.List;

public interface UsersDao {
    List<Users> selectAll();
}
