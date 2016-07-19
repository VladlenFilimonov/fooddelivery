package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/addRestaurant")
    public String testAdd(@RequestParam(value = "name") String name,
                          @RequestParam(value = "email") String email) {
        Restaurant restaurant = new Restaurant();
        restaurant.setCompanyName(name);
        restaurant.setContactEmail(email);
        return String.valueOf(testService.addRestaurant(restaurant).getId());
    }


    @RequestMapping("/find")
    public String getGet(@RequestParam(value = "id") String id) {
        Restaurant rest = testService.getRestaurantById(Long.parseLong(id));
        return rest.getCompanyName();
    }
}
