package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.services.user.UserService;
import accenture.team3.fooddelivery.shared.user.UserGetDto;
import accenture.team3.fooddelivery.shared.user.UserPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserGetDto createUser(@RequestBody UserPostDto userPostDto) {
        return userService.createUser(userPostDto);
    }
}
