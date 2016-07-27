package accenture.team3.fooddelivery.services.category.impl;

import accenture.team3.fooddelivery.dao.CategoryDao;
import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.dto.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.dto.category.CategoryWithRestaurantsDto;
import accenture.team3.fooddelivery.dto.restaurant.RestaurantGetDto;
import accenture.team3.fooddelivery.services.category.CategoryService;
import accenture.team3.fooddelivery.services.restaurant.dto.RestaurantDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
class CategoryServiceImpl implements CategoryService {

    private CategoryDao dao;
    private ModelMapper modelMapper;

    @Autowired
    public CategoryServiceImpl(CategoryDao dao, ModelMapper modelMapper) {
        this.dao = dao;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CategoryMainPageDto> findAllWithWorkingRestaurants() {
        List<Category> categories = (List<Category>) dao.findAll();
        List<CategoryMainPageDto> categoryMainPageDtos = new ArrayList<>();
        for (Category category : categories) {
            CategoryMainPageDto categoryMainPageDto = modelMapper.map(category, CategoryMainPageDto.class);
            categoryMainPageDto.setPictureURL(category.getLogo());
            categoryMainPageDto.setAllRestaurants((int) category.getRestaurants().stream().count());
            categoryMainPageDto.setWorkedRestaurants((int) category.getRestaurants().
                    stream().
                    map(r -> modelMapper.map(r, RestaurantDto.class)).filter(RestaurantDto::isWorkingNow).count());
            categoryMainPageDtos.add(categoryMainPageDto);
        }

        return categoryMainPageDtos;
    }

    @Override
    public CategoryWithRestaurantsDto findById(long id) {
        Category category = dao.findOne(id);
        CategoryWithRestaurantsDto categoryWithRestaurantsDto = modelMapper.map(category, CategoryWithRestaurantsDto.class);
        categoryWithRestaurantsDto.setPictureURL(category.getLogo());
        categoryWithRestaurantsDto.setAllRestaurants((int) category.getRestaurants().stream().count());
        categoryWithRestaurantsDto.setWorkedRestaurants((int) category.getRestaurants().
                stream().
                map(r -> modelMapper.map(r, RestaurantDto.class)).filter(RestaurantDto::isWorkingNow).count());
        Set<Restaurant> restaurants = category.getRestaurants();
        Set<RestaurantGetDto> restaurantsGetDto = new HashSet<>();
//        restaurantsDto = modelMapper.map(restaurants, RestaurantGetDto.class);
//        for (Restaurant restaurant : restaurants) {
//            restaurantsGetDto.add(modelMapper.map(restaurant, RestaurantGetDto.class));
//        }
//        categoryWithRestaurantsDto.setRestaurants(restaurantsGetDto);
        return categoryWithRestaurantsDto;

    }


}
