package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    void addUser();
    void updateUser(int id);
    void removeUser(int id);
    List<User> getAllUsers();
    User getUserById (int id);
}
