package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.dto.RestaurantGetDto;
import accenture.team3.fooddelivery.dto.RestaurantPostDto;
import accenture.team3.fooddelivery.services.RestaurantCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private RestaurantCrudService restaurantCrudService;

    private ModelMapper modelMapper;

    @Autowired
    public RestaurantController(RestaurantCrudService restaurantCrudService, ModelMapper modelMapper) {
        this.restaurantCrudService = restaurantCrudService;
        this.modelMapper = modelMapper;
    }

    @RequestMapping(method = RequestMethod.POST)
    public RestaurantGetDto createRestaurant(@RequestBody RestaurantPostDto restaurantPostDto) {
        Restaurant restaurant = convertToEntity(restaurantPostDto);
        return convertToDto(restaurantCrudService.create(restaurant));
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
//        return restaurantCrudService.create(restaurant);
//    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Restaurant> findAllRestaurants() {
        return restaurantCrudService.findAll();
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public Restaurant findRestaurant(@PathVariable("id") String id) {
//        return restaurantCrudService.findOneById(Long.parseLong(id));
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RestaurantGetDto findRestaurant(@PathVariable("id") String id) {
        Restaurant restaurant = restaurantCrudService.findOneById(Long.parseLong(id));
        return convertToDto(restaurant);
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public Restaurant updateRestaurant(@PathVariable("id") String id){
//        return restaurantCrudService.;
//    }

    @RequestMapping(method = RequestMethod.PUT)
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantCrudService.update(restaurant);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteRestaurant(@PathVariable("id") String id) {
        return String.valueOf(restaurantCrudService.deleteById(Long.parseLong(id)));
    }

    private RestaurantGetDto convertToDto(Restaurant restaurant) {
        RestaurantGetDto restaurantDto = modelMapper.map(restaurant, RestaurantGetDto.class);
        return restaurantDto;
    }

    private Restaurant convertToEntity(RestaurantPostDto restaurantPostDto) {
        Restaurant restaurant = modelMapper.map(restaurantPostDto, Restaurant.class);
        return restaurant;
    }

}
