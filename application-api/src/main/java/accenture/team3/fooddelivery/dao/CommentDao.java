package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentDao extends CrudRepository<Comment, Long> {
}
