package accenture.team3.fooddelivery.services.restaurant;

import accenture.team3.fooddelivery.dto.restaurant.RestaurantCreateDto;
import accenture.team3.fooddelivery.services.restaurant.dto.RestaurantDto;

import java.util.stream.Stream;

public interface RestaurantService {

    Stream<RestaurantDto> findAll();

    Stream<RestaurantDto> findCurrentlyWorking();

    RestaurantDto findById(Long id);

    RestaurantDto create(RestaurantCreateDto restaurantCreateDto);
}
