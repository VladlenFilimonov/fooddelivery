package accenture.team3.fooddelivery.services.categories;

import accenture.team3.fooddelivery.shared.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.shared.category.CategoryWithRestaurantsDto;

import java.util.List;

public interface CategoryService {

    List<CategoryMainPageDto> findAll();

    CategoryWithRestaurantsDto findOne(Long id);
}
