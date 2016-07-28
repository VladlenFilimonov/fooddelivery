package accenture.team3.fooddelivery.shared.restaurant;

import accenture.team3.fooddelivery.domain.Restaurant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Map;

@Data
@NoArgsConstructor
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
    private Map<String, String> categories;
    private double averageRatings;

    public RestaurantGetDto(Restaurant restaurant) {
        this.id = restaurant.getId();
        this.name = restaurant.getName();
        this.logo = restaurant.getLogo();
        this.deliveryFreeFrom = restaurant.getDelivery().getFreeFrom().intValue();
        this.deliveryFreeByClientCard = restaurant.getDelivery().getFreeByClientCard();
        this.deliveryTimeMin = convertHoursInMinutes(restaurant.getDelivery().getTimeMin());
        this.deliveryTimeMax = convertHoursInMinutes(restaurant.getDelivery().getTimeMax());
        this.phone = restaurant.getDelivery().getPhone();
        this.deliveryAcceptCard = restaurant.getAcceptCard();

    }

    public int convertHoursInMinutes(LocalTime localTime) {
        if (localTime == null) return 0;
        return (localTime.getHour()) * 60 + localTime.getMinute();
    }

}
