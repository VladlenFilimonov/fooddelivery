package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.services.restaurant.impl.RestaurantServiceImpl;
import accenture.team3.fooddelivery.shared.restaurant.RestaurantGetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

    private RestaurantServiceImpl restaurantService;

    @Autowired
    public RestaurantController(RestaurantServiceImpl restaurantService) {
        this.restaurantService = restaurantService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RestaurantGetDto findRestaurant(@PathVariable("id") Long id) {
        return restaurantService.getRestaurantGetDtoById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<RestaurantGetDto> findAllRestaurants() {
        return restaurantService.getAllRestaurantsDto();
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public RestaurantGetDto createRestaurant(@RequestBody RestaurantCreateDto restaurantCreateDto) {
//        return restaurantService.create(restaurantCreateDto);
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public List<Restaurant> findAllRestaurants() {
//        return restaurantService.findAll();
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public RestaurantGetDto findRestaurant(@PathVariable("id") String id) {
//        return restaurantService.findOneById(Long.parseLong(id));
//    }
//
////    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
////    public RestaurantGetDto findRestaurant(@PathVariable("id") String id) {
////        Restaurant restaurant = restaurantService.findOneById(Long.parseLong(id));
////        return convertToDto(restaurant);
////    }
//
////    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
////    public Restaurant updateRestaurant(@PathVariable("id") String id){
////        return restaurantService.;
////    }
//
//    @RequestMapping(method = RequestMethod.PUT)
//    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
//        return restaurantService.update(restaurant);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public String deleteRestaurant(@PathVariable("id") String id) {
//        return String.valueOf(restaurantService.deleteById(Long.parseLong(id)));
//    }

}
