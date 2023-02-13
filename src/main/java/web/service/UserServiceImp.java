package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.models.User;

import java.util.List;

@Component
public class UserServiceImp implements UserService{

    private final UserService userService;

    @Autowired
    public UserServiceImp(UserService userService) {
        this.userService = userService;
    }


    @Override
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userService.getUserById(id);
    }
}
