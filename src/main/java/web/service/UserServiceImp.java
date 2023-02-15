package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Component
@Service
public class UserServiceImp implements UserService{

    private final UserDAO userDao;

    @Autowired
    public UserServiceImp(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }
    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
