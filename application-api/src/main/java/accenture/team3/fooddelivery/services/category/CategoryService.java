package accenture.team3.fooddelivery.services.category;

import accenture.team3.fooddelivery.dto.category.CategoryMainPageDto;

import java.util.List;

public interface CategoryService {

    List<CategoryMainPageDto> findAllWithWorkingRestaurants();

}
