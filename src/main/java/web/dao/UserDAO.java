package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
    public void addUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public List<User> getUserTable();
}
