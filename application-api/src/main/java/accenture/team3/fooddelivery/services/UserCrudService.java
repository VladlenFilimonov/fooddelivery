package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.User;

import java.util.List;

public interface UserCrudService {
    User create(User user);

    User update(User user);

    List<User> findAll();

    User findOneById(Long id);

    Long deleteById(Long id);
}
