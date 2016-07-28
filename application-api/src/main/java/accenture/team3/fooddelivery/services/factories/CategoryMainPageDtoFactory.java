package accenture.team3.fooddelivery.services.factories;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.shared.category.CategoryMainPageDto;

public interface CategoryMainPageDtoFactory {

    CategoryMainPageDto convert(Category c);
}
