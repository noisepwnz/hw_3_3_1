package kata_3_3_1.hw_3_3_1.service;


import kata_3_3_1.hw_3_3_1.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

     User findById(Integer id);

    List<User> findAll();

    void update(int id, User updatedUser);

    void delete(int id);
}
