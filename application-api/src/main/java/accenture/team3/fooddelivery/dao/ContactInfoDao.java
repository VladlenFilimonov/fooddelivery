package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.ContactInfo;
import org.springframework.data.repository.CrudRepository;

public interface ContactInfoDao extends CrudRepository<ContactInfo, Long> {
}
