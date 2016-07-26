package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleDao extends CrudRepository<UserRole, Long> {
}
