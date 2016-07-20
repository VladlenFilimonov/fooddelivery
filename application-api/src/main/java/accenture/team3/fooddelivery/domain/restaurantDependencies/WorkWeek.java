package accenture.team3.fooddelivery.domain.restaurantDependencies;

import accenture.team3.fooddelivery.domain.Day;

import javax.persistence.Embeddable;
import java.util.Set;

@Embeddable
public class WorkWeek {

    private Set<Day> daySet;


}
