package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Schedule;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by UberV on 22.07.2016.
 */
public interface ScheduleDao extends CrudRepository<Schedule, Long> {
}
