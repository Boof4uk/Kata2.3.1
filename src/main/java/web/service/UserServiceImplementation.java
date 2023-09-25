package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

    private final UserDAO userDao;

    @Autowired
    UserServiceImplementation(UserDAO userDao) {
        this.userDao = userDao;
    }


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public List<User> getUserTable() {
        return userDao.getUserTable();
    }

}
