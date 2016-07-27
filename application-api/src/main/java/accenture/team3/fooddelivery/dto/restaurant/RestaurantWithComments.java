package accenture.team3.fooddelivery.dto.restaurant;

import accenture.team3.fooddelivery.dto.comment.CommentDto;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantWithComments extends RestaurantDto {
    private List<CommentDto> commentDtoList;
}
