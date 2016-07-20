package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.services.CategoryCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryCrudService categoryCrudService;

    @Autowired
    public CategoryController(CategoryCrudService categoryCrudService) {
        this.categoryCrudService = categoryCrudService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> findAllCategories() {
        return categoryCrudService.findAll();
    }
}
