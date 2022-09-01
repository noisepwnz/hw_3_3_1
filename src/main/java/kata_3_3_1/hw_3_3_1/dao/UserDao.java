package kata_3_3_1.hw_3_3_1.dao;



import kata_3_3_1.hw_3_3_1.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User findById(Integer id);

    List<User> findAll();

    void update(User updatedUser);

    void delete(int id);


}
