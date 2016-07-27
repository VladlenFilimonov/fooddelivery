package accenture.team3.fooddelivery.services.restaurant.impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.restaurant.dto.RestaurantDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Stream;

public class RestaurantService implements accenture.team3.fooddelivery.services.restaurant.RestaurantService {

    private RestaurantDao dao;
    private ModelMapper mapper;

    @Autowired
    public RestaurantService(RestaurantDao dao, ModelMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public Stream<RestaurantDto> findCurrentlyWorking() {
        return findAll().filter(RestaurantDto::isWorkingNow);
    }

    @Override
    public Stream<RestaurantDto> findAll() {
        return ((List<Restaurant>) dao.findAll())
                .stream()
                .map(r -> mapper.map(r, RestaurantDto.class));
    }
}


