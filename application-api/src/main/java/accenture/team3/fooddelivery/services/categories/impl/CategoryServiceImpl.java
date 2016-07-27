package accenture.team3.fooddelivery.services.categories.impl;

import accenture.team3.fooddelivery.dao.CategoryDao;
import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.services.categories.CategoryService;
import accenture.team3.fooddelivery.services.factories.CategoryMainPageDtoFactory;
import accenture.team3.fooddelivery.services.factories.CategoryWithRestaurantsDtoFactory;
import accenture.team3.fooddelivery.shared.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.shared.category.CategoryWithRestaurantsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final Function<Category, CategoryMainPageDto> converter;

    private CategoryDao categoryDao;
    private CategoryMainPageDtoFactory categoryMainPageDtoFactory;
    private CategoryWithRestaurantsDtoFactory categoryWithRestaurantsDtoFactory;

    @Autowired
    public CategoryServiceImpl(CategoryDao categoryDao,
                               CategoryMainPageDtoFactory categoryMainPageDtoFactory,
                               CategoryWithRestaurantsDtoFactory categoryWithRestaurantsDtoFactory) {
        this.categoryDao = categoryDao;
        this.categoryMainPageDtoFactory = categoryMainPageDtoFactory;
        this.categoryWithRestaurantsDtoFactory = categoryWithRestaurantsDtoFactory;
        this.converter = categoryMainPageDtoFactory::convert;
    }


    @Override
    public List<CategoryMainPageDto> findAll() {
        log.debug("Try find all Categories");
        List<Category> categories = (List<Category>) categoryDao.findAll();
        log.debug("Found categories count : {}", categories.size());
        return categories
                .stream()
                .map(converter)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryWithRestaurantsDto findOne(Long id) {
        log.debug("Try find one Category by id : {}", id);
        Category category = categoryDao.findOne(id);
        if (category == null) {
            throw new IllegalArgumentException("category not found by id : " + id);
        }
        log.debug("Found Category by id : {}", id);
        return categoryWithRestaurantsDtoFactory.convert(category);
    }
}
