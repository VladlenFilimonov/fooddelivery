package accenture.team3.fooddelivery.services.restaurant.impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Rating;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.restaurant.RestaurantService;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantDao dao;

    @Autowired
    public RestaurantServiceImpl(RestaurantDao dao) {
        this.dao = dao;
    }

    @Override
    public RestaurantGetDto getRestaurantGetDtoById(Long id) {

        Restaurant restaurant = dao.findOne(id);
        if (restaurant == null) {
            return null;
        }
        return convert(restaurant);
    }

    @Override
    public Restaurant getRestRestaurantById(Long id) {
        log.info("Try find one Restaurant by id : {}", id);
        Restaurant restaurant = dao.findOne(id);
        if (restaurant == null) {
            throw new IllegalArgumentException("restaurant not found by id : " + id);
        }
        log.info("Found Restaurant by id : {}", id);
        return restaurant;
    }

    @Override
    public List<RestaurantGetDto> getAllRestaurantsDto() {
        List<Restaurant> restaurants = (List<Restaurant>) dao.findAll();
        return restaurants.stream().map(this::convert).collect(Collectors.toList());
    }

    private RestaurantGetDto convert(Restaurant restaurant) {
        RestaurantGetDto dto = new RestaurantGetDto(restaurant);
        dto.setAverageRatings(restaurant.getRatings()
                .stream()
                .mapToDouble(Rating::getValue)
                .average()
                .orElse(0));
        dto.setCategories(restaurant.getUrls()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().getName(),
                        entry -> entry.getValue())));

        return dto;
    }
}


