package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.Restaurant;

public interface TestService {
    Restaurant getRestaurantById(Long id);
    Restaurant addRestaurant(Restaurant restaurant);
}
