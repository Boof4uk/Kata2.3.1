package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAOImplementation;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

    private final UserDAOImplementation userDAOImplementation;

    @Autowired
    UserServiceImplementation(UserDAOImplementation userDAOImplementation) {
        this.userDAOImplementation = userDAOImplementation;
    }


    @Override
    public void addUser(String name, String surname) {
        userDAOImplementation.addUser(name, surname);
    }

    @Override
    public void deleteUser(int id) {
        userDAOImplementation.deleteUser(id);

    }

    @Override
    public void updateUser(int id, String name, String surname) {
        userDAOImplementation.updateUser(id, name, surname);
    }

    public List<User> getUserTable() {
        return userDAOImplementation.getUserTable();
    }

}
