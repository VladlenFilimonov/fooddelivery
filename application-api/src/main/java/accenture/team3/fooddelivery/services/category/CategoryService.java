package accenture.team3.fooddelivery.services.category;

import accenture.team3.fooddelivery.dto.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.dto.category.CategoryWithRestaurantsDto;

import java.util.List;

public interface CategoryService {

    CategoryWithRestaurantsDto findById(long id);

    List<CategoryMainPageDto> findAllWithWorkingRestaurants();

}
