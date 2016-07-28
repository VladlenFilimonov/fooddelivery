package accenture.team3.fooddelivery.controllers;


import accenture.team3.fooddelivery.services.categories.CategoryService;
import accenture.team3.fooddelivery.shared.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.shared.category.CategoryWithRestaurantsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@Slf4j
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handle(RuntimeException e) {
        log.error("Error Message : {}", e.getMessage(), e);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<CategoryMainPageDto> findAllCategories() {
        log.info("findAllCategories request");
        return categoryService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CategoryWithRestaurantsDto findCategory(@PathVariable("id") Long id) {
        log.info("findCategory request by id : {}", id);
        return categoryService.findOne(id);
    }
}
