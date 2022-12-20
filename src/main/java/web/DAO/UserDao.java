package web.DAO;

import web.Model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    User getUserById(long id);
}
