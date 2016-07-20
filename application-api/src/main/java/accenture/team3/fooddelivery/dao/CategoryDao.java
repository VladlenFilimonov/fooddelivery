package accenture.team3.fooddelivery.dao;

/**
 * Created by UberV on 20.07.2016.
 */

import accenture.team3.fooddelivery.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Long> {
}
