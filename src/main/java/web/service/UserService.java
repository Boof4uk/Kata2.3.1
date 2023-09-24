package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    public void addUser(String name, String surname);
    public void deleteUser(int id);
    public void updateUser(int id, String name, String surname);
    public List<User> getUserTable();

}
