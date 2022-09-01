package kata_3_3_1.hw_3_3_1.service;


import kata_3_3_1.hw_3_3_1.dao.UserDao;
import kata_3_3_1.hw_3_3_1.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);

    }

    @Transactional
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);

    }

    @Transactional
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    @Override
    public void update(int id, User updatedUser) {
        userDao.update(updatedUser);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
