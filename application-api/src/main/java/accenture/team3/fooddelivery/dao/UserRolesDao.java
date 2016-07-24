package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.UserDependencies.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface UserRolesDao extends CrudRepository<UserRole, Long> {
}
