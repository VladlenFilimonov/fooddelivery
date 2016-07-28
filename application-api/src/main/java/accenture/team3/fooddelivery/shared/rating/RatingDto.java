package accenture.team3.fooddelivery.shared.rating;

import accenture.team3.fooddelivery.domain.Rating;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RatingDto {

    private Long id;
    private Integer value;
    private Long userId;
    private Long restaurantId;

    public RatingDto(Rating rating) {
        this.id = rating.getId();
        this.value = rating.getValue();
        this.userId = rating.getUser().getId();
        this.restaurantId = rating.getRestaurant().getId();
    }
}
