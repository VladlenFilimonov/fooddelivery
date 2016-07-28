package accenture.team3.fooddelivery.services.factories.impl;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.factories.CategoryMainPageDtoFactory;
import accenture.team3.fooddelivery.services.factories.CategoryWithRestaurantsDtoFactory;
import accenture.team3.fooddelivery.services.factories.RestaurantGetDtoFactory;
import accenture.team3.fooddelivery.shared.category.CategoryMainPageDto;
import accenture.team3.fooddelivery.shared.category.CategoryWithRestaurantsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryWithRestaurantsDtoFactoryImpl implements CategoryWithRestaurantsDtoFactory {

    private CategoryMainPageDtoFactory categoryMainPageDtoFactory;
    private RestaurantGetDtoFactory restaurantGetDtoFactory;

    @Autowired
    public CategoryWithRestaurantsDtoFactoryImpl(CategoryMainPageDtoFactory categoryMainPageDtoFactory,
                                                 RestaurantGetDtoFactory restaurantGetDtoFactory) {
        this.categoryMainPageDtoFactory = categoryMainPageDtoFactory;
        this.restaurantGetDtoFactory = restaurantGetDtoFactory;
    }

    @Override
    public CategoryWithRestaurantsDto convert(Category category) {
        log.debug("Try convert from Category to CategoryWithRestaurantsDto : {}", category);
        CategoryMainPageDto mainPageDto = categoryMainPageDtoFactory.convert(category);
        CategoryWithRestaurantsDto dto = new CategoryWithRestaurantsDto();
        dto.setId(mainPageDto.getId());
        dto.setName(mainPageDto.getName());
        dto.setWorkedRestaurants(mainPageDto.getWorkedRestaurants());
        dto.setAllRestaurants(mainPageDto.getAllRestaurants());
        dto.setPictureURL(mainPageDto.getPictureURL());
        dto.setRestaurants1(
                category.getRestaurants()
                        .stream()
                        .filter(Restaurant::isWorkingNow)
                        .map(restaurantGetDtoFactory::convert)
                        .collect(Collectors.toSet())
        );

        return dto;
    }
}
