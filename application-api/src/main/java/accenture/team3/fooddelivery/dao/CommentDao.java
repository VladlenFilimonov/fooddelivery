package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.domain.Comment;
import accenture.team3.fooddelivery.domain.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentDao extends CrudRepository<Comment, Long> {

    List<Comment> findAllByRestaurant(Restaurant restaurant);
}
