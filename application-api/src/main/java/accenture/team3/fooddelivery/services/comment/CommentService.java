package accenture.team3.fooddelivery.services.comment;

import accenture.team3.fooddelivery.shared.comment.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getComments(Long id);

    List<CommentDto> addComments(CommentDto commentDto);
}
