package accenture.team3.fooddelivery.services.restaurant;

import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetWithComments;

public interface RestaurantService {

    RestaurantGetDto getRestaurantById(Long id);

    RestaurantGetWithComments getRestaurantWithComments(Long id);


}
