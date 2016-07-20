package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.services.MealCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meal")
public class MealController {

    private MealCrudService mealCrudService;

    @Autowired
    public MealController(MealCrudService mealCrudService) {
        this.mealCrudService = mealCrudService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> findAllMeals() {
        return mealCrudService.findAll();
    }
}
