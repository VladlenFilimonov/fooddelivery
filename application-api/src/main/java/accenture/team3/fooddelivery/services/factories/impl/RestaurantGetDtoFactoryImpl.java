package accenture.team3.fooddelivery.services.factories.impl;

import accenture.team3.fooddelivery.domain.Rating;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.factories.CategoryMainPageDtoFactory;
import accenture.team3.fooddelivery.services.factories.RestaurantGetDtoFactory;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@Slf4j
public class RestaurantGetDtoFactoryImpl implements RestaurantGetDtoFactory {

    private CategoryMainPageDtoFactory factory;

    @Autowired
    public RestaurantGetDtoFactoryImpl(CategoryMainPageDtoFactory factory) {
        this.factory = factory;
    }

    @Override
    public RestaurantGetDto convert(Restaurant r) {
        log.debug("Try convert from Restaurant to RestaurantGetDto : {}", r);
        RestaurantGetDto dto = new RestaurantGetDto(r);
        dto.setAverageRatings(r.getRatings()
                .stream()
                .mapToInt(Rating::getValue)
                .average()
                .orElse(0));
        dto.setCategories(r.getUrls()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().getName(),
                        entry -> entry.getValue())));
        return dto;
    }
}
