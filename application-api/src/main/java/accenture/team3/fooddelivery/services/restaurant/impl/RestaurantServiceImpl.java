package accenture.team3.fooddelivery.services.restaurant.impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Rating;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.factories.CategoryMainPageDtoFactory;
import accenture.team3.fooddelivery.services.restaurant.RestaurantService;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetWithComments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantDao dao;
    private CategoryMainPageDtoFactory factory;

    @Autowired
    public RestaurantServiceImpl(RestaurantDao dao, CategoryMainPageDtoFactory factory) {
        this.dao = dao;
        this.factory = factory;
    }

    @Override
    public RestaurantGetDto getRestaurantById(Long id) {

        Restaurant restaurant = dao.findOne(id);
        if (restaurant == null) {
            return null;
        }

        RestaurantGetDto dto = new RestaurantGetDto(restaurant);
        dto.setAverageRatings(restaurant.getRatings()
                .stream()
                .mapToInt(Rating::getValue)
                .average()
                .orElse(0));
        dto.setCategories(restaurant.getUrls()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> factory.convert(entry.getKey()),
                        entry -> entry.getValue())));

        return dto;
    }

    @Override
    public RestaurantGetWithComments getRestaurantWithComments(Long id) {
        return null;
    }
}


