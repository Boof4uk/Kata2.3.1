package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {
    public void addUser(String name, String surname);
    public void deleteUser(int id);
    public void updateUser(int id, String name, String surname);
    public List<User> getUserTable();
}
