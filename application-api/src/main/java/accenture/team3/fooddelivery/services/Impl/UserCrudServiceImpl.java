package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.UserDao;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.services.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserCrudServiceImpl implements UserCrudService {

    private UserDao UserDao;

    @Autowired
    public UserCrudServiceImpl(UserDao UserDao) {
        this.UserDao = UserDao;
    }

    @Override
    public User create(User user) {
        return UserDao.save(user);
    }

    @Override
    public User update(User user) {
        return UserDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) UserDao.findAll();
    }

    @Override
    public User findOneById(Long id) {
        return UserDao.findOne(id);
    }

    @Override
    public Long deleteById(Long id) {
        try {
            UserDao.delete(id);
        } catch (EmptyResultDataAccessException e) {
            return 0l;
        }
        return id;
    }
}
