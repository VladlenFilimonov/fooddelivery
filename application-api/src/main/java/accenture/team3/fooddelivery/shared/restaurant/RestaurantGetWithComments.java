package accenture.team3.fooddelivery.shared.restaurant;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.shared.comment.CommentDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class RestaurantGetWithComments extends RestaurantGetDto {

    private List<CommentDto> commentDtoList;

    RestaurantGetWithComments(Restaurant restaurant) {
        super(restaurant);
    }
}
