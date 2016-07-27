package accenture.team3.fooddelivery.services.category.impl;

import accenture.team3.fooddelivery.dao.CategoryDao;
import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.dto.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.services.category.CategoryService;
import accenture.team3.fooddelivery.services.restaurant.dto.RestaurantDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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


}
