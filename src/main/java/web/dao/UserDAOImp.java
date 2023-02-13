package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAOImp implements UserDAO {
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User("Wooden", "Worm", 30));
        users.add(new User("Sweaty", "Beast", 70));
        users.add(new User("Co4UH9IU-XAH", "Unknown", 39));
        users.add(new User("Good", "Beetle", 55));
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
