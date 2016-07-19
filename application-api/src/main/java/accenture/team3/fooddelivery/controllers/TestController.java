package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.TestPrintDB;
import accenture.team3.fooddelivery.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private TestService testService;

    private TestPrintDB testPrintDB;


    @Autowired
    public TestController(TestService testService, TestPrintDB testPrintDB) {
        this.testService = testService;
        this.testPrintDB = testPrintDB;
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
    public String getGet(@RequestParam(value = "id") String id) {
        Restaurant rest = testService.getRestaurantById(Long.parseLong(id));
        return rest.getCompanyName();
    }

    @RequestMapping("/printrestaurants")
    public String printRestaurants(Model model) {
        List<Restaurant> list = testPrintDB.getAllRestaurants();
        System.out.println();
//        list.forEach( (r) -> System.out.println(r));
        model.addAttribute("restaurants", list);
        return "dbrestauranttable";
    }




}
