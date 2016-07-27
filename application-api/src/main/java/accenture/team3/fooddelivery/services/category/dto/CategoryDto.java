package accenture.team3.fooddelivery.services.category.dto;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.services.restaurant.dto.RestaurantDto;
import lombok.Data;

import java.util.Set;

@Data
public class CategoryDto {

    Set<RestaurantDto> restaurants;
    private String name;
    private byte[] logo;

    public CategoryDto(Category c, Set<RestaurantDto> restaurants) {
        this.name = c.getName();
        this.logo = c.getLogo();
        this.restaurants = restaurants;
    }
}
