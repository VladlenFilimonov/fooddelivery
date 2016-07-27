package accenture.team3.fooddelivery.dto.category;

//import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import accenture.team3.fooddelivery.dto.restaurant.RestaurantDto;
import lombok.Data;

import java.util.Set;

@Data
public class CategoryWithRestaurantsDto {
    private Long id;
    private String name;
    private String pictureURL;
    private int allRestaurants;
    private int workedRestaurants;
    private Set<RestaurantDto> restaurants;
}
