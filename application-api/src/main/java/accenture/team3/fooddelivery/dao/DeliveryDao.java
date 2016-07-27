package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Delivery;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryDao extends CrudRepository<Delivery, Long> {
}
