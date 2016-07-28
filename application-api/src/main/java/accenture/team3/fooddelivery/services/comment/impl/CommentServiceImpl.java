package accenture.team3.fooddelivery.services.comment.impl;


import accenture.team3.fooddelivery.dao.CommentDao;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.services.comment.CommentService;
import accenture.team3.fooddelivery.services.restaurant.RestaurantService;
import accenture.team3.fooddelivery.services.user.UserService;
import accenture.team3.fooddelivery.shared.comment.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        return commentDao.findAllByRestaurant(restaurantService.getRestRestaurantById(id))
                .stream()
                .map(CommentDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<CommentDto> addComments(CommentDto commentDto) {
        log.info("Try add new Comment : {}");
        User user = userService.getUserById((long) commentDto.getUserId());
        return null;
    }
}