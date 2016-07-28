package accenture.team3.fooddelivery.services.restaurant;

import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;

public interface RestaurantService {

    RestaurantGetDto getRestaurantById(Long id);

}
