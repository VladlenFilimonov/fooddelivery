package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
