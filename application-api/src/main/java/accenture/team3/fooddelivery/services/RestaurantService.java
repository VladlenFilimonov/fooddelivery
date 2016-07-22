package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.dto.RestaurantGetDto;
import accenture.team3.fooddelivery.dto.RestaurantPostDto;

import java.util.List;

public interface RestaurantService {
    RestaurantGetDto create(RestaurantPostDto restaurant);

    Restaurant update(Restaurant restaurant);

    List<Restaurant> findAll();

    RestaurantGetDto findOneById(Long id);

    Long deleteById(Long id);
}
