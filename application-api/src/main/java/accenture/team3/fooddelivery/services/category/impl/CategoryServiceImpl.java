package accenture.team3.fooddelivery.services.category.impl;

import accenture.team3.fooddelivery.dao.CategoryDao;
import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.services.category.CategoryService;
import accenture.team3.fooddelivery.services.category.dto.CategoryDto;
import accenture.team3.fooddelivery.services.restaurant.RestaurantService;
import accenture.team3.fooddelivery.services.restaurant.dto.RestaurantDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Stream;

class CategoryServiceImpl implements CategoryService {

    private CategoryDao dao;
    private RestaurantService restaurantService;

    @Autowired
    public CategoryServiceImpl(CategoryDao dao, RestaurantService restaurantService) {
        this.dao = dao;
        this.restaurantService = restaurantService;
    }

    @Override
    public Stream<CategoryDto> findAllWithWorkingRestaurants() {
        Stream<RestaurantDto> restaurants = restaurantService.findCurrentlyWorking();
        List<Category> all = (List<Category>) dao.findAll();

        //combine 2 streams to map into CategoryDto (may use own Collector)
        return null;
    }


}
