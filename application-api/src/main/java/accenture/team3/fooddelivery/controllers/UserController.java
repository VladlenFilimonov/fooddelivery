package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.services.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserCrudService userCrudService;

    @Autowired
    public UserController(UserCrudService userCrudService) {
        this.userCrudService = userCrudService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userCrudService.findAll();
    }
}
