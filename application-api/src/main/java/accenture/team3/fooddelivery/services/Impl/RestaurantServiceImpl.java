package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.dto.restaurant.RestaurantGetDto;
import accenture.team3.fooddelivery.dto.restaurant.RestaurantPostDto;
import accenture.team3.fooddelivery.services.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantDao restaurantDao;
    private ModelMapper modelMapper;

    @Autowired
    public RestaurantServiceImpl(RestaurantDao restaurantDao, ModelMapper modelMapper) {
        this.restaurantDao = restaurantDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public RestaurantGetDto create(RestaurantPostDto restaurantPostDto) {
        Restaurant restaurant = convertToEntity(restaurantPostDto);
        return convertToDto(restaurantDao.save(restaurant));
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
    public RestaurantGetDto findOneById(Long id) {
        Restaurant restaurant = restaurantDao.findOne(id);
        if (restaurant == null) return null;
        RestaurantGetDto restaurantGetDto = convertToDto(restaurant);

        if (restaurant.getUser() == null) return restaurantGetDto;

        restaurantGetDto.setUserId(restaurant.getUser().getId());
        restaurantGetDto.setFirstName(restaurant.getUser().getFirstName());
        restaurantGetDto.setLastName(restaurant.getUser().getLastName());

        return restaurantGetDto;
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

    private RestaurantGetDto convertToDto(Restaurant restaurant) {
        RestaurantGetDto restaurantGetDto = modelMapper.map(restaurant, RestaurantGetDto.class);
        return restaurantGetDto;
    }

    private Restaurant convertToEntity(RestaurantPostDto restaurantPostDto) {
        Restaurant restaurant = modelMapper.map(restaurantPostDto, Restaurant.class);
        return restaurant;
    }
}
