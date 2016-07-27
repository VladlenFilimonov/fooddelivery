package accenture.team3.fooddelivery.dto.restaurant;

import accenture.team3.fooddelivery.dto.category.CategoryMainPageDto;
import lombok.Data;

import java.util.Map;

/**
 * Created by student007 on 16.21.7.
 */
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
