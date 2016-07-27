package accenture.team3.fooddelivery.services.comment;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.shared.comment.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getComments(Restaurant restaurant);
}
