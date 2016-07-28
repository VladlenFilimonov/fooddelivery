package accenture.team3.fooddelivery.services.restaurant;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;

import java.util.List;

public interface RestaurantService {

    RestaurantGetDto getRestaurantGetDtoById(Long id);

    Restaurant getRestRestaurantById(Long id);

    List<RestaurantGetDto> getAllRestaurantsDto();

}
