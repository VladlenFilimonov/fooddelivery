package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.dto.category.CategoryWithRestaurantsDto;

import java.util.List;

public interface CategoryCrudService {
    Category create(Category category);

    Category update(Category category);

    List<Category> findAll();

    CategoryWithRestaurantsDto findOneById(Long id);

    Long deleteById(Long id);
}
