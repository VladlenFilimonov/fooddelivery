package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/add")
    public String testAdd(@RequestParam(value = "name") String name,
                          @RequestParam(value = "email") String email) {
        Restaurant restaurant = new Restaurant();
        restaurant.setCompanyName(name);
        restaurant.setContactEmail(email);
        return String.valueOf(testService.addRestaurant(restaurant).getId());
    }

    @RequestMapping("/find")
    public Restaurant getGet(@RequestParam(value = "id") String id) {
        return testService.getRestaurantById(Long.parseLong(id));
    }

    @RequestMapping("/setJson")
    public String getJason(@RequestBody Restaurant restaurant) {

        return restaurant.getCompanyName();
    }

}
