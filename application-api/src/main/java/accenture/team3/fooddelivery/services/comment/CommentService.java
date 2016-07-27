package accenture.team3.fooddelivery.services.comment;

import accenture.team3.fooddelivery.dto.comment.CommentDto;

import java.util.List;

public interface CommentService {
    /*Return List of comments because we need full list of current comments
    after every request, not only 1 created comment*/
    List<CommentDto> create(CommentDto commentDto);

    List<CommentDto> deleteById(long id);
}
