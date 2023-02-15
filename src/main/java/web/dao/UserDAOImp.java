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
    public void addUser(User user) {
        user.setId(++id);
        users.add(user);
    }

    @Override
    public void updateUser(int id, User user) {
        User updatedUser = getUser(id);
        updatedUser.setName(user.getName());
        updatedUser.setSurname(user.getSurname());
        updatedUser.setAge(user.getAge());

    }

    @Override
    public void removeUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
