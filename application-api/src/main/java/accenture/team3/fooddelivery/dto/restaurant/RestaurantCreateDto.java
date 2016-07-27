package accenture.team3.fooddelivery.dto.restaurant;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.Delivery;
import accenture.team3.fooddelivery.domain.WorkDay;
import accenture.team3.fooddelivery.domain.embedded.Audit;
import lombok.Data;

import java.util.Set;

@Data
public class RestaurantCreateDto {

    private String name;
    private byte[] logo;
    private Delivery delivery;
    private Boolean acceptCard;
    private Set<Category> categories;
    private Set<WorkDay> workDays;
    private Audit audit;
}
