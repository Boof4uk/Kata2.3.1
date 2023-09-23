package web.service;

import web.models.User;

public interface UserService {

    public void addUser(String name, String surname);
    public void deleteUser(int id);
    public void changeUser(int id, String name, String surname);
}
