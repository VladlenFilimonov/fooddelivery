package accenture.team3.fooddelivery.services.rating.impl;

import accenture.team3.fooddelivery.dao.RatingDao;
import accenture.team3.fooddelivery.domain.Rating;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.User;
import accenture.team3.fooddelivery.services.rating.RatingService;
import accenture.team3.fooddelivery.services.restaurant.RestaurantService;
import accenture.team3.fooddelivery.services.user.UserService;
import accenture.team3.fooddelivery.shared.rating.RatingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@lombok.extern.slf4j.Slf4j
class RatingServiceImpl implements RatingService {

    private RatingDao ratingDao;
    private RestaurantService restaurantService;
    private UserService userService;

    @Autowired
    public RatingServiceImpl(RatingDao ratingDao, RestaurantService restaurantService, UserService userService) {
        this.ratingDao = ratingDao;
        this.restaurantService = restaurantService;
        this.userService = userService;
    }

    @Override
    public Double addRating(RatingDto ratingDto) {
        log.info("Adding new rating started : {}");
        User user = userService.getUserById((long) ratingDto.getUserId());
        Restaurant restaurant = restaurantService.getRestRestaurantById((long) ratingDto.getRestaurantId());
        Rating rating = new Rating();
        rating.setValue(ratingDto.getValue());
        rating.setUser(user);
        rating.setRestaurant(restaurant);
        log.info("Try add new Rating : {}");
        if (ratingDao.save(rating) == null) {
            throw new IllegalArgumentException("rating doesn't save");
        }
        Double averageRating = restaurant.getRatings()
                .stream()
                .mapToDouble(Rating::getValue)
                .average()
                .orElse(0);
        return averageRating;
    }
}
