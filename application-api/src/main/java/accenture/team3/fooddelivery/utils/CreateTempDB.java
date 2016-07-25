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
import java.util.*;

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
    public CreateTempDB(CommentDao commentDao, ScheduleDao scheduleDao, AdminService adminService, RestaurantDao restaurantDao, UserDao userDao, CategoryDao categoryDao, RatingDao ratingDao) {
        this.adminService = adminService;
        this.commentDao = commentDao;
        this.scheduleDao = scheduleDao;
        this.ratingDao = ratingDao;
        this.categoryDao = categoryDao;
        this.restaurantDao = restaurantDao;
        this.userDao = userDao;
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

        List<Category> categories = (List<Category>) categoryDao.findAll();
        Set<Category> categorySet = new HashSet<>(categories);

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
                schedulesSet1,
                new BigDecimal(25.00),
                true,
                true,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                categoryUrls,
                categorySet,
                "logo.png",
                (byte) 1,
                ratingsSet,
                commentSet1,
                userDao.findOne(1l));
        Restaurant restaurant1 = new Restaurant(
                "Accenture",
                "http://accenture.lv",
                "987654321",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                schedulesSet2,
                new BigDecimal(25.00),
                true,
                true,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                categoryUrls,
                categorySet,
                "logo.png",
                (byte) 1,
                ratingsSet1,
                commentSet2,
                userDao.findOne(2l));

        Restaurant restaurant2 = new Restaurant(
                "StakeHouse",
                "http://stakehouse.lv",
                "6666666666666",
                new DeliveryTime(LocalTime.MIN, LocalTime.MAX),
                schedulesSet3,
                new BigDecimal(25.00),
                true,
                true,
                new CreateUpdateTime(LocalDateTime.now(), LocalDateTime.now()),
                categoryUrls,
                categorySet,
                "logo.png",
                (byte) 1,
                null,
                null,
                userDao.findOne(2l));

        restaurantDao.save(restaurant);
        restaurantDao.save(restaurant1);
        restaurantDao.save(restaurant2);

        categoryDao.save(category);
        categoryDao.save(category1);
        categoryDao.save(category2);

        List<Schedule> scheduleList = (List<Schedule>) scheduleDao.findAll();
        List<Restaurant> restaurants = (List<Restaurant>) restaurantDao.findAll();
        for (Schedule schedule : scheduleList) {
            for (Restaurant restaurant3 : restaurants) {
                for (Schedule schedule7 : restaurant.getSchedule()) {
                    if (schedule7.equals(schedule)) schedule.setRestaurant(restaurant3);
                }
            }
        }
        //scheduleDao.save(scheduleList);

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
