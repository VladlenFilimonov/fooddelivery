package accenture.team3.fooddelivery.dto.restaurant;

import accenture.team3.fooddelivery.dto.category.CategoryMainPageDto;
import lombok.Data;

import java.util.Map;

@Data
public class RestaurantGetDto {

    private Long id;
    private String name;
    private String logo;

    private int deliveryFreeFrom;
    private Boolean deliveryFreeByClientCard;
    private int deliveryTimeMin;
    private int deliveryTimeMax;
    private String phone;
    private Boolean deliveryAcceptCard;

    private Map<CategoryMainPageDto, String> categories;
    private double averageRatings;

}
