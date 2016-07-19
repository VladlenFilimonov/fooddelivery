package accenture.team3.fooddelivery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
In Spring’s approach to building RESTful web services,
HTTP requests are handled by a controller.
These components are easily identified by the @RestController
annotation, and the GreetingController below handles GET
requests for /greeting by returning a new instance of the Greeting class:
 */

// controller is used to display html and jsp
@Controller
public class ViewController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/html")
    public String html(@RequestParam(value = "name", defaultValue = "Ivan") String name
            , @RequestParam(value = "surname", defaultValue = "Ivanov") String surname) {
        return "indexThymeleaf";
    }

    @RequestMapping("/thymegreeting")
    public String thymegreeting(@RequestParam(value = "name", required = false, defaultValue = "Ivan") String name
            , @RequestParam(value = "surname", required = false, defaultValue = "Ivanov") String surname
            , Model model) {
        // controller writes requested data into our model (html here)
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        // i vozvrashaet stroku, kakuju view vzjatj
        return "indexThymeleaf";
    }

}