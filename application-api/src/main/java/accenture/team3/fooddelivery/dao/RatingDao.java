package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingDao extends CrudRepository<Rating, Long> {
}
