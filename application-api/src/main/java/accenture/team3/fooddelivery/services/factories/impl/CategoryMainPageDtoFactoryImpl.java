package accenture.team3.fooddelivery.services.factories.impl;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.factories.CategoryMainPageDtoFactory;
import accenture.team3.fooddelivery.shared.category.CategoryMainPageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryMainPageDtoFactoryImpl implements CategoryMainPageDtoFactory {

    @Override
    public CategoryMainPageDto convert(Category c) {

        log.debug("Try convert from Category to CategoryMainPageDto : {}", c);
        CategoryMainPageDto dto = new CategoryMainPageDto();
        dto.setAllRestaurants(c.getRestaurants().size());
        dto.setName(c.getName());
        dto.setId(c.getId());
        dto.setPictureURL(c.getLogo());
        int worked = (int) c.getRestaurants()
                .stream()
                .filter(Restaurant::isWorkingNow)
                .count();
        dto.setWorkedRestaurants(worked);
        dto.setAllRestaurants((int) c.getRestaurants().stream().count());
        return dto;
    }
}
