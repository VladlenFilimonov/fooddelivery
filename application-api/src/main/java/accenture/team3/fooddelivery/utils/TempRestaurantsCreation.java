package accenture.team3.fooddelivery.utils;


import accenture.team3.fooddelivery.domain.Meal;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.WorkWeek;
import accenture.team3.fooddelivery.services.MealCrudService;
import accenture.team3.fooddelivery.services.RestaurantCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class TempRestaurantsCreation {

    private RestaurantCrudService restaurantCrudService;
    private MealCrudService mealCrudService;

    @Autowired
    public TempRestaurantsCreation(RestaurantCrudService restaurantCrudService, MealCrudService mealCrudService) {
        this.restaurantCrudService = restaurantCrudService;
        this.mealCrudService = mealCrudService;
        createDB();
    }

    public void createDB() {
        Meal meal = new Meal(1l,
                "Pizza",
                "http://pizzaLogo",
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());

        Meal meal1 = new Meal(2l,
                "BBQ",
                "http://BBQ",
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());
        Meal meal2 = new Meal(3l,
                "WOK",
                "http://WOK",
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());
        Restaurant restaurant = new Restaurant(1l,
                "Lido",
                "http://lido.lv",
                "1234567",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                new WorkWeek(),
                new BigDecimal(25.00),
                true,
                true,
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashMap<>(),
                new HashSet<>());
        Restaurant restaurant1 = new Restaurant(2l,
                "Accenture",
                "http://accenture.lv",
                "987654321",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                new WorkWeek(),
                new BigDecimal(100.00),
                false,
                false,
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashMap<>(),
                new HashSet<>());

        Restaurant restaurant2 = new Restaurant(3l,
                "StakeHouse",
                "http://stakehouse.lv",
                "6666666666666",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                new WorkWeek(),
                new BigDecimal(200.00),
                true,
                false,
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashMap<>(),
                new HashSet<>());
        Map<Long, String> restaurantMealURL = new HashMap<>();
        restaurantMealURL.put(meal.getId(), "http://lido.lv/pizza");
        restaurantMealURL.put(meal1.getId(), "http://lido.lv/BBQ");
        Set<Meal> restMeals = new HashSet<>();
        restMeals.add(meal);
        restMeals.add(meal1);
        restaurant.setMealsURL(restaurantMealURL);
        restaurant.setMeals(restMeals);

        Map<Long, String> restaurantMealURL1 = new HashMap<>();
        restaurantMealURL1.put(meal1.getId(), "http://accenture.lv/BBQ");
        restaurantMealURL1.put(meal2.getId(), "http://accenture.lv/WOK");
        Set<Meal> restMeals1 = new HashSet<>();
        restMeals1.add(meal1);
        restMeals1.add(meal2);
        restaurant1.setMealsURL(restaurantMealURL1);
        restaurant1.setMeals(restMeals1);

        Map<Long, String> restaurantMealURL2 = new HashMap<>();
        restaurantMealURL2.put(meal.getId(), "http://stakehouse.lv/BBQ");
        restaurantMealURL2.put(meal2.getId(), "http://stakehouse.lv/WOK");
        Set<Meal> restMeals2 = new HashSet<>();
        restMeals2.add(meal);
        restMeals2.add(meal2);
        restaurant2.setMealsURL(restaurantMealURL2);
        restaurant2.setMeals(restMeals2);

        mealCrudService.create(meal);
        mealCrudService.create(meal1);
        mealCrudService.create(meal2);

        restaurantCrudService.create(restaurant);
        restaurantCrudService.create(restaurant1);
        restaurantCrudService.create(restaurant2);
    }
}
