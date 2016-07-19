package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.TestPrintDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestPrintDBImpl implements TestPrintDB {

    private RestaurantDao restaurantDao;

    @Autowired
    public TestPrintDBImpl(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        // Returns all instances of the type.
        return (List<Restaurant>) restaurantDao.findAll();
    }

}
