package accenture.team3.fooddelivery.services.category;

import accenture.team3.fooddelivery.services.category.dto.CategoryDto;

import java.util.stream.Stream;

public interface CategoryService {

    Stream<CategoryDto> findAllWithWorkingRestaurants();

    CategoryDto findById(long id);

}
