package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDAOImplementation implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void addUser(String name, String surname) {
        User user = new User(name, surname);
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }

    @Override
    @Transactional
    public void changeUser(int id, String name, String surname) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            user.setName(name);
            user.setSurname(surname);
        }
    }
}
