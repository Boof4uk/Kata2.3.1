package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDAOImplementation;

@Component
public class UserServiceImplementation implements UserService {


    @Autowired
    UserDAOImplementation userDAOImplementation;

    @Override
    public void addUser(String name, String surname) {
        userDAOImplementation.addUser(name, surname);
    }

    @Override
    public void deleteUser(int id) {
        userDAOImplementation.deleteUser(id);

    }

    @Override
    public void changeUser(int id, String name, String surname) {
        userDAOImplementation.changeUser(id, name, surname);
    }
}
