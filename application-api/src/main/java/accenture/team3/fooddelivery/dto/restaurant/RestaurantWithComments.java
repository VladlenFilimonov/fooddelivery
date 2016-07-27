package accenture.team3.fooddelivery.dto.restaurant;

import accenture.team3.fooddelivery.dto.comment.CommentDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RestaurantWithComments extends RestaurantDto {
    private List<CommentDto> commentDtoList;
}
