package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Meal;
import org.springframework.data.repository.CrudRepository;

public interface MealDao extends CrudRepository<Meal, Long> {
}
