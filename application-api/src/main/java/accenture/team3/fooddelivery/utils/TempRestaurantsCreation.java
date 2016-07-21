package accenture.team3.fooddelivery.utils;


import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.WorkWeek;
import accenture.team3.fooddelivery.services.CategoryCrudService;
import accenture.team3.fooddelivery.services.CommentCrudService;
import accenture.team3.fooddelivery.services.RestaurantCrudService;
import accenture.team3.fooddelivery.services.UserCrudService;
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
    private CategoryCrudService mealCrudService;
    private CommentCrudService commentCrudService;
    private UserCrudService userCrudService;

    @Autowired
    public TempRestaurantsCreation(RestaurantCrudService restaurantCrudService, CategoryCrudService mealCrudService, CommentCrudService commentCrudService, UserCrudService userCrudService) {
        this.restaurantCrudService = restaurantCrudService;
        this.mealCrudService = mealCrudService;
        this.commentCrudService = commentCrudService;
        this.userCrudService = userCrudService;
        createDB();
    }

    public void createDB() {
        Category category = new Category((byte) 1, 1l,
                "Pizza",
                "http://pizzaLogo",
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());

        Category category1 = new Category((byte) 1, 2l,
                "BBQ",
                "http://BBQ",
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());
        Category category2 = new Category((byte) 1, 3l,
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
                new HashSet<>(),
                "logo.png",
                (byte) 1);
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
                new HashSet<>(),
                "logo.png",
                (byte) 1);

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
                new HashSet<>(),
                "logo.png",
                (byte) 1);
        Map<Long, String> restaurantMealURL = new HashMap<>();
        restaurantMealURL.put(category.getId(), "http://lido.lv/pizza");
        restaurantMealURL.put(category1.getId(), "http://lido.lv/BBQ");
        Set<Category> restCategories = new HashSet<>();
        restCategories.add(category);
        restCategories.add(category1);
        restaurant.setCategoryURL(restaurantMealURL);
        restaurant.setCategories(restCategories);

        Map<Long, String> restaurantMealURL1 = new HashMap<>();
        restaurantMealURL1.put(category1.getId(), "http://accenture.lv/BBQ");
        restaurantMealURL1.put(category2.getId(), "http://accenture.lv/WOK");
        Set<Category> restMeals1 = new HashSet<>();
        restMeals1.add(category1);
        restMeals1.add(category2);
        restaurant1.setCategoryURL(restaurantMealURL1);
        restaurant1.setCategories(restMeals1);

        Map<Long, String> restaurantMealURL2 = new HashMap<>();
        restaurantMealURL2.put(category.getId(), "http://stakehouse.lv/BBQ");
        restaurantMealURL2.put(category2.getId(), "http://stakehouse.lv/WOK");
        Set<Category> restMeals2 = new HashSet<>();
        restMeals2.add(category);
        restMeals2.add(category2);
        restaurant2.setCategoryURL(restaurantMealURL2);
        restaurant2.setCategories(restMeals2);


        mealCrudService.create(category);
        mealCrudService.create(category1);
        mealCrudService.create(category2);

        restaurantCrudService.create(restaurant);
        restaurantCrudService.create(restaurant1);
        restaurantCrudService.create(restaurant2);

        //User user = new User(new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()), (byte) 1, "user");
        //userCrudService.create(user);

        // public Comment(long restaurantId, byte status, byte type, String content, SystemDateTime systemDateTime,User user) {
//        Comment comment = new Comment((byte) 1, (byte) 1, "test", new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()), user);
//        commentCrudService.create(comment);

        /*Comment comment = new Comment(1l,
                (byte) 1,
                (byte) 1,
                "test ",
                1l,
                new SystemDateTime(LocalDateTime.now(), LocalDateTime.now()));
                */
        //commentCrudService.create(comment);
    }
}
