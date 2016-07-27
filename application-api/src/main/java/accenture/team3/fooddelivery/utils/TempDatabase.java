package accenture.team3.fooddelivery.utils;

import accenture.team3.fooddelivery.dao.*;
import accenture.team3.fooddelivery.domain.*;
import accenture.team3.fooddelivery.domain.classifier.SecurityRole;
import accenture.team3.fooddelivery.domain.classifier.Status;
import accenture.team3.fooddelivery.domain.embedded.Audit;
import com.google.common.collect.Sets;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class TempDatabase {

    private CategoryDao categoryDao;
    private CommentDao commentDao;
    private ContactInfoDao contactInfoDao;
    private DeliveryDao deliveryDao;
    private RatingDao ratingDao;
    private RestaurantDao restaurantDao;
    private ScheduleDao scheduleDao;
    private UserDao userDao;
    private UserRoleDao userRoleDao;

    public TempDatabase() {
    }

    public TempDatabase(CategoryDao categoryDao, CommentDao commentDao, ContactInfoDao contactInfoDao, DeliveryDao deliveryDao, RatingDao ratingDao, RestaurantDao restaurantDao, ScheduleDao scheduleDao, UserDao userDao, UserRoleDao userRoleDao) {
        this.categoryDao = categoryDao;
        this.commentDao = commentDao;
        this.contactInfoDao = contactInfoDao;
        this.deliveryDao = deliveryDao;
        this.ratingDao = ratingDao;
        this.restaurantDao = restaurantDao;
        this.scheduleDao = scheduleDao;
        this.userDao = userDao;
        this.userRoleDao = userRoleDao;
    }

    @Transactional
    public void createDb() {

        Category category01 = new Category();
        Category category02 = new Category();
        Category category03 = new Category();
        category01.setName("Pizza");
        category02.setName("BBQ");
        category03.setName("Soup");

        categoryDao.save(category01);
        categoryDao.save(category02);
        categoryDao.save(category03);

        Map<Category, String> categoryUrls1 = new HashMap<>();
        categoryUrls1.put(category01, "http://lidoPizza.lv");
        categoryUrls1.put(category02, "http://lidoBBQ.lv");

        Map<Category, String> categoryUrls2 = new HashMap<>();
        categoryUrls2.put(category03, "http://SteakHouse/Soup");
        categoryUrls2.put(category02, "http://StakeHouse/BBQ.lv");

        Set<Category> categorySet1 = Sets.newHashSet(category01, category02);
        Set<Category> categorySet2 = Sets.newHashSet(category02, category03);

        Restaurant restaurant = new Restaurant(
                null,
                "Lido",
                null,
                new Delivery(null,
                        new BigDecimal(25.00),
                        true,
                        LocalTime.MIN,
                        LocalTime.MAX,
                        "27744332"
                ),
                true,
                Status.ACTIVE,
                categorySet1,
                categoryUrls1,
                null,
                null,
                null,
                new Audit(LocalDateTime.now(), LocalDateTime.now()));

        Restaurant restaurant2 = new Restaurant(
                null,
                "StakeHouse",
                null,
                new Delivery(null,
                        new BigDecimal(25.00),
                        true,
                        LocalTime.MIN,
                        LocalTime.MAX,
                        "27744332"
                ),
                true,
                Status.ACTIVE,
                categorySet2,
                categoryUrls2,
                null,
                null,
                null,
                new Audit(LocalDateTime.now(), LocalDateTime.now()));

        restaurantDao.save(restaurant);
        restaurantDao.save(restaurant2);

        category01.setRestaurants(Sets.newHashSet(restaurant));
        category02.setRestaurants(Sets.newHashSet(restaurant, restaurant2));
        category03.setRestaurants(Sets.newHashSet(restaurant2));
        categoryDao.save(category01);
        categoryDao.save(category02);
        categoryDao.save(category03);


        WorkDay workDay1 = new WorkDay(null, DayOfWeek.SUNDAY, LocalTime.MIN, LocalTime.MAX, null);
        WorkDay workDay2 = new WorkDay(null, DayOfWeek.THURSDAY, LocalTime.MIN, LocalTime.MAX, null);
        WorkDay workDay3 = new WorkDay(null, DayOfWeek.SATURDAY, LocalTime.MIN, LocalTime.MAX, null);
        WorkDay workDay4 = new WorkDay(null, DayOfWeek.SUNDAY, LocalTime.MIN, LocalTime.MAX, null);

        Set<WorkDay> workDays = Sets.newHashSet(workDay1, workDay3);
        Set<WorkDay> workDays1 = Sets.newHashSet(workDay2, workDay4);

        workDays.forEach(v -> v.setRestaurant(restaurant));
        workDays1.forEach(v -> v.setRestaurant(restaurant2));

        scheduleDao.save(workDays);
        scheduleDao.save(workDays1);

        restaurant.setWorkDays(workDays);
        restaurant2.setWorkDays(workDays1);

        User user1 = new User(null,
                "Vladlens",
                "Filimonovs",
                "1234",
                "vladlenfilimonov@gmail.com",
                "AnonymousX",
                null,
                null,
                new Audit(LocalDateTime.now(), LocalDateTime.now()),
                null
        );

        User user2 = new User(null,
                "Dmitrijs",
                "Jakovlevs",
                "1234",
                "email",
                "login",
                null,
                null,
                new Audit(LocalDateTime.now(), LocalDateTime.now()),
                null
        );

        userDao.save(user1);
        userDao.save(user2);

        UserRole userRole = new UserRole(null, null, SecurityRole.ADMIN);
        UserRole userRole2 = new UserRole(null, null, SecurityRole.MANAGER);
        UserRole userRole3 = new UserRole(null, null, SecurityRole.USER);

        userRole.setUser(Sets.newHashSet(user1, user2));
        userRole2.setUser(Sets.newHashSet(user1));
        userRole3.setUser(Sets.newHashSet(user2));

        userRoleDao.save(userRole);
        userRoleDao.save(userRole2);
        userRoleDao.save(userRole3);

        user1.setRoles(Sets.newHashSet(userRole, userRole2));
        user2.setRoles(Sets.newHashSet(userRole, userRole3));

        userDao.save(user1);
        userDao.save(user2);

        Rating rating1 = new Rating(null, 10, null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));
        Rating rating2 = new Rating(null, 6, null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));
        Rating rating3 = new Rating(null, 8, null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));
        Rating rating4 = new Rating(null, 2, null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));

        Set<Rating> ratingSet1 = Sets.newHashSet(rating1, rating2);
        Set<Rating> ratingSet2 = Sets.newHashSet(rating3, rating4);

        ratingSet1.forEach(r -> r.setUser(user1));
        ratingSet2.forEach(r -> r.setUser(user2));

        ratingSet1.forEach(r -> r.setRestaurant(restaurant));
        ratingSet2.forEach(r -> r.setRestaurant(restaurant2));

        ratingDao.save(ratingSet1);
        ratingDao.save(ratingSet2);
//
//        restaurant.setRatings(ratingSet1);
//        restaurant2.setRatings(ratingSet2);

        user1.setRating(ratingSet1);
        user2.setRating(ratingSet2);

        userDao.save(user1);
        userDao.save(user2);

        Comment comment = new Comment(null, "Horoso", null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));
        Comment comment2 = new Comment(null, "Ploho", null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));

        Set<Comment> commentSet1 = Sets.newHashSet(comment);
        Set<Comment> commentSet2 = Sets.newHashSet(comment2);

        commentSet1.forEach(c -> c.setUser(user1));
        commentSet2.forEach(c -> c.setUser(user2));

        commentSet1.forEach(c -> c.setRestaurant(restaurant));
        commentSet2.forEach(c -> c.setRestaurant(restaurant2));

        commentDao.save(commentSet1);
        commentDao.save(commentSet2);

        user1.setComments(commentSet1);
        user2.setComments(commentSet2);

        userDao.save(user1);
        userDao.save(user2);

        restaurantDao.save(restaurant);
        restaurantDao.save(restaurant2);

    }
}
