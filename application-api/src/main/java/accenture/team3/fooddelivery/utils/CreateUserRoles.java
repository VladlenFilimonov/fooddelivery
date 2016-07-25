package accenture.team3.fooddelivery.utils;

import accenture.team3.fooddelivery.dao.UserRolesDao;
import accenture.team3.fooddelivery.domain.userDependencies.SecurityRoles;
import accenture.team3.fooddelivery.domain.userDependencies.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CreateUserRoles {

    private UserRolesDao userRolesDao;

    @Autowired
    public CreateUserRoles(UserRolesDao userRolesDao) {
        this.userRolesDao = userRolesDao;
        createUserRoleTable();
    }

    private void createUserRoleTable() {
        Set<UserRole> userRoles = new HashSet<>();
        for (SecurityRoles securityRoles : SecurityRoles.values()) {
            userRoles.add(new UserRole(securityRoles));
        }
        userRolesDao.save(userRoles);
    }
}
