package web.dao;

public interface UserDAO {
    public void addUser(String name, String surname);
    public void deleteUser(int id);
    public void changeUser(int id, String name, String surname);
}
