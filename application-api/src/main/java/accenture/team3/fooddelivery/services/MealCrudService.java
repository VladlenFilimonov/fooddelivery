package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.Meal;

import java.util.List;

public interface MealCrudService {
    Meal create(Meal meal);

    Meal update(Meal meal);

    List<Meal> findAll();

    Meal findOneById(Long id);

    Long deleteById(Long id);
}
