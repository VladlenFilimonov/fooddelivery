package accenture.team3.fooddelivery.services.comment.impl;


import accenture.team3.fooddelivery.dao.CommentDao;
import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.comment.CommentService;
import accenture.team3.fooddelivery.shared.comment.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
class CommentServiceImpl implements CommentService {

    private CommentDao commentDao;
    private RestaurantDao restaurantDao;

    @Autowired
    public CommentServiceImpl(CommentDao commentDao, RestaurantDao restaurantDao) {
        this.commentDao = commentDao;
        this.restaurantDao = restaurantDao;
    }

    @Override
    public List<CommentDto> getComments(Long id) {
        Restaurant restaurant = restaurantDao.findOne(id);
        return commentDao.findAllByRestaurant(restaurant)
                .stream()
                .map(CommentDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<CommentDto> addComments() {
        return null;
    }
}