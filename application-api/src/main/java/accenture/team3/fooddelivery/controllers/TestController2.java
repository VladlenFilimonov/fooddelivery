package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.TestPrintDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController2 {


    private TestPrintDB testPrintDB;


    @Autowired
    public TestController2(TestPrintDB testPrintDB) {

        this.testPrintDB = testPrintDB;
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
