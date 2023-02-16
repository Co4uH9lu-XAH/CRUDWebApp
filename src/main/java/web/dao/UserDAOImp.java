package web.dao;

import org.springframework.stereotype.Repository;
import web.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private final EntityManager entityManager;

    public UserDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    private int id;
//    private List<User> users;
//
//    {
//        users = new ArrayList<>();
//        users.add(new User(++id, "Wooden", "Worm", 30));
//        users.add(new User(++id, "Sweaty", "Beast", 70));
//        users.add(new User(++id, "Co4UH9IU-XAH", "Unknown", 39));
//        users.add(new User(++id, "Good", "Beetle", 55));
//    }

    @Override
    public void addUser(User user) {
//        user.setId(++id);
//        users.add(user);
        entityManager.persist(user);
    }

    @Override
    public void updateUser(int id, User user) {
        entityManager.merge(user);
    }

    @Override
    public void removeUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();

    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }
}
