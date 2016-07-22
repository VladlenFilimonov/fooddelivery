package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.Category;

import java.util.List;

public interface CategoryCrudService {
    Category create(Category category);

    Category update(Category category);

    List<Category> findAll();

    Category findOneById(Long id);

    Long deleteById(Long id);
}
