package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.Restaurant;

import java.util.List;

public interface RestaurantCrudService {
    Restaurant create(Restaurant restaurant);

    Restaurant update(Restaurant restaurant);

    List<Restaurant> findAll();

    Restaurant findOneById(Long id);

    Long deleteById(Long id);
}
