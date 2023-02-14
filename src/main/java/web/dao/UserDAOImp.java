package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAOImp implements UserDAO {
    private int id;
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++id, "Wooden", "Worm", 30));
        users.add(new User(++id, "Sweaty", "Beast", 70));
        users.add(new User(++id, "Co4UH9IU-XAH", "Unknown", 39));
        users.add(new User(++id, "Good", "Beetle", 55));
    }

    @Override
    public void addUser() {

    }

    @Override
    public void updateUser(int id) {

    }

    @Override
    public void removeUser(int id) {
        users.remove(users.stream().filter(user -> user.getId() == id).findAny().orElse(null));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
