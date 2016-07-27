package accenture.team3.fooddelivery.dto.category;

import lombok.Data;

@Data
public class CategoryWithRestaurantsDto {
    private Long id;
    private String name;
    private String pictureURL;
    private int allRestaurants;
    private int workedRestaurants;
//    private Set<RestaurantGetDto> restaurants;
}
