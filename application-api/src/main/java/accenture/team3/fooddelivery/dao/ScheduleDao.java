package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.WorkDay;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleDao extends CrudRepository<WorkDay, Long> {
}
