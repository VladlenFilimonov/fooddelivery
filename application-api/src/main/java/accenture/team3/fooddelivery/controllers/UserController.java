package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.User;
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

    private static final String template = "Hello, %s!";

    @RequestMapping("/users")
    public String list(Model model) {

        User user;
        System.out.println("User controller called");
        user = new User("Ivan", "Ivanov", (byte) 3, "ivan.ivanov@mail.ru");

        System.out.println("user.toString() = " + user.toString());
        model.addAttribute("user", user);

        return "users";
    }
}

