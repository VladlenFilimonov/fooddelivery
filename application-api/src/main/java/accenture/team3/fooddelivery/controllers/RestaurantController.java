package accenture.team3.fooddelivery.controllers;

import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.RestaurantCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private RestaurantCrudService restaurantCrudService;

    @Autowired
    public RestaurantController(RestaurantCrudService restaurantCrudService) {
        this.restaurantCrudService = restaurantCrudService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantCrudService.create(restaurant);
    }

    @PreAuthorize("hasRole('USER')")
    @RequestMapping(method = RequestMethod.GET)
    public List<Restaurant> findAllRestaurants() {
        System.out.println("get user");
        return restaurantCrudService.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Restaurant findRestaurant(@PathVariable("id") String id) {
        System.out.println("get id admin");
        return restaurantCrudService.findOneById(Long.parseLong(id));
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

}
