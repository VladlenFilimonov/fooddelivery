package accenture.team3.fooddelivery.services;

import accenture.team3.fooddelivery.domain.Comment;

import java.util.List;

public interface CommentCrudService {
    Comment create(Comment comment);

    Comment update(Comment comment);

    List<Comment> findAll();

    Comment findOneById(Long id);

    Long deleteById(Long id);
}
