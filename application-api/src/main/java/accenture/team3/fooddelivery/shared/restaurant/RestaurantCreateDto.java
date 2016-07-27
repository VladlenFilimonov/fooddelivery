package accenture.team3.fooddelivery.shared.restaurant;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.ContactInfo;
import accenture.team3.fooddelivery.domain.Delivery;
import accenture.team3.fooddelivery.domain.WorkDay;
import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class RestaurantCreateDto {

    private String name;
    private String logo;
    private Delivery delivery;
    private Boolean acceptCard;
    private ContactInfo contactInfo;
    private Map<Category, String> urls;
    private Set<WorkDay> workDays;

}
