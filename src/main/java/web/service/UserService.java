package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public List<User> getUserTable();
    public User findUser(int id);

}
