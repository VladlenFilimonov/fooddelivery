package accenture.team3.fooddelivery.shared.rating;

import lombok.Data;

@Data
public class RatingDto {

    private Long id;
    private Integer value;
    private Long restaurantId;
    private Long userId;

}
