package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
In Spring’s approach to building RESTful web services,
HTTP requests are handled by a controller.
These components are easily identified by the @RestController
annotation, and the GreetingController below handles GET
requests for /greeting by returning a new instance of the Greeting class:
 */

// controller is used to display html and jsp
@Controller
public class UserController {

    /*
    As soon as Spring sees the @Autowired annotation on top of the ProductRepository
    reference, it assigns the object of InMemoryProductRepository to this reference
    since Spring already created and holds the InMemoryProductRepository object in
    its object container (the web application context).
     */
    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/user")
    public String list(Model model) {

        User user;
        System.out.println("User controller called");
        user = new User("Ivan", "Ivanov", (byte) 3, "ivan.ivanov@mail.ru");

        System.out.println("user.toString() = " + user.toString());
        model.addAttribute("user", user);

        return "user";
    }

    @RequestMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userRepository.getAllUsers());
        return "users";
    }
}

