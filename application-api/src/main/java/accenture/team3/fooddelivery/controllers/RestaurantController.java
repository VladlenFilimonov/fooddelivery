package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.dto.restaurant.RestaurantGetDto;
import accenture.team3.fooddelivery.dto.restaurant.RestaurantPostDto;
import accenture.team3.fooddelivery.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

    private RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public RestaurantGetDto createRestaurant(@RequestBody RestaurantPostDto restaurantPostDto) {
        return restaurantService.create(restaurantPostDto);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Restaurant> findAllRestaurants() {
        return restaurantService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RestaurantGetDto findRestaurant(@PathVariable("id") String id) {
        return restaurantService.findOneById(Long.parseLong(id));
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public RestaurantGetDto findRestaurant(@PathVariable("id") String id) {
//        Restaurant restaurant = restaurantService.findOneById(Long.parseLong(id));
//        return convertToDto(restaurant);
//    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public Restaurant updateRestaurant(@PathVariable("id") String id){
//        return restaurantService.;
//    }

    @RequestMapping(method = RequestMethod.PUT)
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.update(restaurant);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteRestaurant(@PathVariable("id") String id) {
        return String.valueOf(restaurantService.deleteById(Long.parseLong(id)));
    }

}
