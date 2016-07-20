package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.RestaurantCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantCrudServiceImpl implements RestaurantCrudService {

    private RestaurantDao restaurantDao;

    @Autowired
    public RestaurantCrudServiceImpl(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }


    @Override
    public Restaurant create(Restaurant restaurant) {
        return restaurantDao.save(restaurant);
    }

    @Override
    public Restaurant update(Restaurant restaurant) {
        return restaurantDao.save(restaurant);
    }

    @Override
    public List<Restaurant> findAll() {
        return (List<Restaurant>) restaurantDao.findAll();
    }

    @Override
    public Restaurant findOneById(Long id) {
        return restaurantDao.findOne(id);
    }

    @Override
    public Long deleteById(Long id) {
        try {
            restaurantDao.delete(id);
        } catch (EmptyResultDataAccessException e) {
            return 0l;
        }
        return id;
    }
}
