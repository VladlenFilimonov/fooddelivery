package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.dto.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.dto.category.CategoryWithRestaurantsDto;
import accenture.team3.fooddelivery.services.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<CategoryMainPageDto> findAllCategories() {
        return categoryService.findAllWithWorkingRestaurants();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CategoryWithRestaurantsDto findCategory(@PathVariable("id") String id) {
        return categoryService.findById(Long.parseLong(id));
    }

}
