package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private RestaurantDao restaurantDao;

    @Autowired
    public TestServiceImpl(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        return restaurantDao.findOne(id);
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantDao.save(restaurant);
    }
}
