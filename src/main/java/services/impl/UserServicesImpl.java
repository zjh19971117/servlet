package services.impl;

import dao.UsersDao;
import dao.impl.UsersDaoImpl;
import services.UserServices;
import entity.Users;

import java.util.List;

public class UserServicesImpl implements UserServices {
    private UsersDao uo = new UsersDaoImpl();
    @Override
    public List<Users> selectAll() {
        return uo.selectAll();
    }
}
