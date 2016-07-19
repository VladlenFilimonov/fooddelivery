package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantDao extends CrudRepository<Restaurant, Long> {
}
