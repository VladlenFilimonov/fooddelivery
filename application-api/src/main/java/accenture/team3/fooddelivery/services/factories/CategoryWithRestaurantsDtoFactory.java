package accenture.team3.fooddelivery.services.factories;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.shared.category.CategoryWithRestaurantsDto;

public interface CategoryWithRestaurantsDtoFactory {

    CategoryWithRestaurantsDto convert(Category c);
}
