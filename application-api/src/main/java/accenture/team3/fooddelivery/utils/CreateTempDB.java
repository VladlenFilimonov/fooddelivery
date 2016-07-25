package accenture.team3.fooddelivery.utils;


import accenture.team3.fooddelivery.dao.*;
import accenture.team3.fooddelivery.domain.*;
import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;
import accenture.team3.fooddelivery.domain.userDependencies.SecurityRoles;
import accenture.team3.fooddelivery.dto.admin.users.AddNewUserDto;
import accenture.team3.fooddelivery.services.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class CreateTempDB {

    private AdminService adminService;
    private RestaurantDao restaurantDao;
    private UserDao userDao;
    private CategoryDao categoryDao;
    private RatingDao ratingDao;
    private ScheduleDao scheduleDao;
    private CommentDao commentDao;

    @Autowired
    public CreateTempDB(AdminService adminService, RestaurantDao restaurantDao, UserDao userDao, CategoryDao categoryDao, RatingDao ratingDao, ScheduleDao scheduleDao, CommentDao commentDao) {
        this.adminService = adminService;
        this.restaurantDao = restaurantDao;
        this.userDao = userDao;
        this.categoryDao = categoryDao;
        this.ratingDao = ratingDao;
        this.scheduleDao = scheduleDao;
        this.commentDao = commentDao;
        createTempUsers();
        createRestaurants();
    }

    private void createRestaurants() {

        Schedule mondaySchedule = new Schedule((byte) 1,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                DayOfWeek.MONDAY,
                LocalTime.MIN,
                LocalTime.MAX,
                null);
        Schedule tuesdaySchedule = new Schedule((byte) 1,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                DayOfWeek.TUESDAY,
                LocalTime.MIN,
                LocalTime.MAX,
                null);
        Schedule saturdaySchedule = new Schedule((byte) 1,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                DayOfWeek.SATURDAY,
                LocalTime.MIN,
                LocalTime.MAX,
                null);

        scheduleDao.save(mondaySchedule);
        scheduleDao.save(tuesdaySchedule);
        scheduleDao.save(saturdaySchedule);

        Category category = new Category((byte) 1, 1l,
                "Pizza",
                "http://pizzaLogo",
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());

        Category category1 = new Category((byte) 1, 2l,
                "BBQ",
                "http://BBQ",
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());
        Category category2 = new Category((byte) 1, 3l,
                "WOK",
                "http://WOK",
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                new HashSet<>());

        Rating rating = new Rating((byte) 1,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                null,
                userDao.findOne(1l));
        Rating rating2 = new Rating((byte) 1,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                null,
                userDao.findOne(2l));

        ratingDao.save(rating);
        ratingDao.save(rating2);

        Comment comment = new Comment(
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                (byte) 1,
                (byte) 1,
                "Uzasnaja dostavka",
                userDao.findOne(1l),
                null);
        Comment comment2 = new Comment(
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                (byte) 1,
                (byte) 1,
                "Ni4e tak norm",
                userDao.findOne(2l),
                null);

        commentDao.save(comment);
        commentDao.save(comment2);

        Map<Long, String> categoryUrls = new HashMap<>();
        categoryUrls.put(1l, "http://category.link");
        categoryUrls.put(2l, "http://category.link2");
        categoryUrls.put(3l, "http://category.link3");

        Schedule schedule1 = scheduleDao.findOne(1l);
        Set<Schedule> schedulesSet1 = new HashSet<>();
        schedulesSet1.add(schedule1);

        Schedule schedule2 = scheduleDao.findOne(2l);
        Set<Schedule> schedulesSet2 = new HashSet<>();
        schedulesSet1.add(schedule2);

        Schedule schedule3 = scheduleDao.findOne(3l);
        Set<Schedule> schedulesSet3 = new HashSet<>();
        schedulesSet1.add(schedule3);

        Rating rating10 = ratingDao.findOne(1l);
        Set<Rating> ratingsSet = new HashSet<>();
        ratingsSet.add(rating10);

        Rating rating11 = ratingDao.findOne(2l);
        Set<Rating> ratingsSet1 = new HashSet<>();
        ratingsSet.add(rating11);

        Comment comment1 = commentDao.findOne(1l);
        Set<Comment> commentSet1 = new HashSet<>();
        commentSet1.add(comment1);

        Comment comment22 = commentDao.findOne(2l);
        Set<Comment> commentSet2 = new HashSet<>();
        commentSet1.add(comment22);

        Restaurant restaurant = new Restaurant(
                "Lido",
                "http://lido.lv",
                "1234567",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                null,
                new BigDecimal(25.00),
                true,
                true,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                categoryUrls,
                new HashSet<>(),
                "logo.png",
                (byte) 1,
                null,
                null,
                userDao.findOne(1l));
        Restaurant restaurant1 = new Restaurant(
                "Accenture",
                "http://accenture.lv",
                "987654321",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                null,
                new BigDecimal(25.00),
                true,
                true,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                categoryUrls,
                new HashSet<>(),
                "logo.png",
                (byte) 1,
                null,
                null,
                userDao.findOne(2l));

        Restaurant restaurant2 = new Restaurant(
                "StakeHouse",
                "http://stakehouse.lv",
                "6666666666666",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                null,
                new BigDecimal(25.00),
                true,
                true,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                categoryUrls,
                new HashSet<>(),
                "logo.png",
                (byte) 1,
                null,
                null,
                userDao.findOne(2l));

        Set<Restaurant> restaurants = new HashSet<>();
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant);

        category.setRestaurants(restaurants);
        category1.setRestaurants(restaurants);
        category2.setRestaurants(restaurants);

        categoryDao.save(category);
        categoryDao.save(category1);
        categoryDao.save(category2);


    }


    private void createTempUsers() {
        Set<String> roles = new HashSet<>();
        roles.add(SecurityRoles.ADMIN.name());
        roles.add(SecurityRoles.USER.name());

        Set<String> roles1 = new HashSet<>();
        roles1.add(SecurityRoles.ADMIN.name());
        roles1.add(SecurityRoles.MANAGER.name());

        AddNewUserDto addNewUserDto = new AddNewUserDto(
                "Vladlens",
                "Filimonovs",
                "1234", "1234",
                "vladlenfilimonov@gmail.com",
                "AnonymousX",
                roles,
                null
        );

        AddNewUserDto addNewUserDto1 = new AddNewUserDto("Dmitrijs",
                "Jakovlevs",
                "1234", "1234",
                "dmitrijs@gmail.com",
                "DmItRiJ",
                roles1,
                null
        );

        adminService.addUser(addNewUserDto);
        adminService.addUser(addNewUserDto1);
    }
}
