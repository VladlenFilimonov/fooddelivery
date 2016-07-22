package accenture.team3.fooddelivery.services.Impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.dto.RestaurantGetDto;
import accenture.team3.fooddelivery.dto.RestaurantPostDto;
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
    private RestaurantGetDto restaurantGetDto;
    private RestaurantPostDto restaurantPostDto;

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
        return convertToDto(restaurantDao.findOne(id));
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
        restaurantGetDto = modelMapper.map(restaurant, RestaurantGetDto.class);
        return restaurantGetDto;
    }

    private Restaurant convertToEntity(RestaurantPostDto restaurantPostDto) {
        Restaurant restaurant = modelMapper.map(restaurantPostDto, Restaurant.class);
        return restaurant;
    }
}
