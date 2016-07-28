package accenture.team3.fooddelivery.services.comment.impl;


import accenture.team3.fooddelivery.dao.CommentDao;
import accenture.team3.fooddelivery.domain.Comment;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.services.comment.CommentService;
import accenture.team3.fooddelivery.services.restaurant.RestaurantService;
import accenture.team3.fooddelivery.services.user.UserService;
import accenture.team3.fooddelivery.shared.comment.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@lombok.extern.slf4j.Slf4j
class CommentServiceImpl implements CommentService {

    private CommentDao commentDao;
    private RestaurantService restaurantService;
    private UserService userService;

    @Autowired
    public CommentServiceImpl(CommentDao commentDao, RestaurantService restaurantService, UserService userService) {
        this.commentDao = commentDao;
        this.restaurantService = restaurantService;
        this.userService = userService;
    }

    @Override
    public List<CommentDto> getComments(Long id) {
        log.info("Try get Comment : {}");
        List<Comment> comments = commentDao.findAllByRestaurant(restaurantService.getRestRestaurantById(id));
        List<CommentDto> commentDtos = new ArrayList<>();
        for (Comment comment : comments) {
            CommentDto commentDto = new CommentDto(comment);
            commentDto.setRestaurantId(id.intValue());
            commentDto.setUserId(comment.getUser().getId().intValue());
            commentDtos.add(commentDto);
        }
        return commentDtos;
    }

    @Override
    public List<CommentDto> addComments(CommentDto commentDto) {
        log.info("Adding new comment started : {}");
        User user = userService.getUserById((long) commentDto.getUserId());
        Restaurant restaurant = restaurantService.getRestRestaurantById((long) commentDto.getRestaurantId());
        Comment comment = new Comment();
        comment.setContent(commentDto.getContent());
        comment.setUser(user);
        comment.setRestaurant(restaurant);
        log.info("Try add new Comment : {}");
        if (commentDao.save(comment) == null) {
            throw new IllegalArgumentException("Comment doesn't save");
        }
        return getComments((long) commentDto.getRestaurantId());
    }
}