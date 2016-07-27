package accenture.team3.fooddelivery.shared.category;

import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;
import lombok.Data;

import java.util.Set;

@Data
public class CategoryWithRestaurantsDto {
    private Long id;
    private String name;
    private String pictureURL;
    private int allRestaurants;
    private int workedRestaurants;
    private Set<RestaurantGetDto> restaurants1;
}
