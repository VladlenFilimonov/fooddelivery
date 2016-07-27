package accenture.team3.fooddelivery.services.factories;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;

public interface RestaurantGetDtoFactory {

    RestaurantGetDto convert(Restaurant r);
}
