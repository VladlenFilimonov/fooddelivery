package accenture.team3.fooddelivery.services.admin.impl;

import accenture.team3.fooddelivery.Application;
import accenture.team3.fooddelivery.domain.UserDependencies.SecurityRoles;
import accenture.team3.fooddelivery.domain.UserDependencies.UserRole;
import accenture.team3.fooddelivery.dto.admin.AddNewUserDto;
import accenture.team3.fooddelivery.dto.admin.UserDto;
import accenture.team3.fooddelivery.services.admin.AdminService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by student on 16.25.7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class AdminServiceImplTest {

    Set<UserRole> roles = new HashSet<>();
    AddNewUserDto testUser = new AddNewUserDto();
    @Autowired
    private AdminService adminService;

    @Before
    public void setUp() throws Exception {
        roles.add(new UserRole(SecurityRoles.USER));
        roles.add(new UserRole(SecurityRoles.ADMIN));
        roles.add(new UserRole(SecurityRoles.MANAGER));

        Set<String> uRoles = new HashSet<>();
        uRoles.add(SecurityRoles.USER.name());
        uRoles.add(SecurityRoles.ADMIN.name());
        uRoles.add(SecurityRoles.MANAGER.name());

        testUser.setFirstName("Alex");
        testUser.setLastName("Petrov");
        testUser.setPassword("password");
        testUser.setRePassword("password");
        testUser.setEmail("alekspetrovs@inbox.lv");
        testUser.setLoginName("login");
        testUser.setUserRoles(uRoles);
        testUser.setRestaurant(null);


    }

    @After
    public void tearDown() throws Exception {

    }

    /*@Test
    public void getRestaurantsForUser() throws Exception {

    }*/
    @Test
    public void should_returnNull_when_passwordNotEqual() throws Exception {
        testUser.setRePassword("");

        assertNull(adminService.addUser(testUser));
    }

    @Test
    public void addUser() throws Exception {

        UserDto userFromDb = adminService.addUser(testUser);

        assertEquals("Alex", userFromDb.getFirstName());
        assertEquals("Petrov", userFromDb.getLastName());
        assertEquals("password", userFromDb.getPassword());
        assertEquals("alekspetrovs@inbox.lv", userFromDb.getEmail());
        assertEquals("login", userFromDb.getLoginName());
        assertEquals(roles, userFromDb.getUserRoles());
        assertEquals(null, userFromDb.getRestaurant());
    }

    /*@Test
    public void getSimpleUserList() throws Exception {

    }*/

}