package accenture.team3.fooddelivery.services.user.impl;

import accenture.team3.fooddelivery.dao.UserDao;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.services.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserById(Long id) {

        log.info("Try find one User by id : {}", id);
        User user = userDao.findOne(id);
        if (user == null) {
            throw new IllegalArgumentException("User not found by id : " + id);
        }
        log.info("Found User by id : {}", id);
        return user;
    }

}
