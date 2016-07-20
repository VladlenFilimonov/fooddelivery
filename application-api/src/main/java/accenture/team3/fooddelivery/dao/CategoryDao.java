package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Long> {
}
