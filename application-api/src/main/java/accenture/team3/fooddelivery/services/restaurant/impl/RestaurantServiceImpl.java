package accenture.team3.fooddelivery.services.restaurant.impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Rating;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.comment.CommentService;
import accenture.team3.fooddelivery.services.restaurant.RestaurantService;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantDao dao;
    private CommentService commentService;

    @Autowired
    public RestaurantServiceImpl(RestaurantDao dao, CommentService commentService) {
        this.dao = dao;
        this.commentService = commentService;
    }

    @Override
    public RestaurantGetDto getRestaurantById(Long id) {

        Restaurant restaurant = dao.findOne(id);
        if (restaurant == null) {
            return null;
        }

        RestaurantGetDto dto = new RestaurantGetDto(restaurant);
        dto.setAverageRatings(restaurant.getRatings()
                .stream()
                .mapToInt(Rating::getValue)
                .average()
                .orElse(0));
        dto.setCategories(restaurant.getUrls()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().getName(),
                        entry -> entry.getValue())));

        return dto;
    }
}

