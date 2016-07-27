package accenture.team3.fooddelivery.utils;

import accenture.team3.fooddelivery.dao.*;
import accenture.team3.fooddelivery.domain.*;
import accenture.team3.fooddelivery.domain.classifier.SecurityRole;
import accenture.team3.fooddelivery.domain.classifier.Status;
import accenture.team3.fooddelivery.domain.embedded.Audit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
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

    @Autowired
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

        createDb();
    }

    @Transactional
    private void createDb() {


        Category category01 = new Category(null, "Pizza", null, null);
        Category category02 = new Category(null, "BBQ", null, null);
        Category category03 = new Category(null, "Salat", null, null);

        Category category = categoryDao.save(category01);
        Category category1 = categoryDao.save(category02);
        Category category2 = categoryDao.save(category03);

        Set<Category> categorySet1 = new HashSet<>();
        categorySet1.add(category);
        categorySet1.add(category1);

        Set<Category> categorySet2 = new HashSet<>();
        categorySet2.add(category2);
        categorySet2.add(category1);

        Map<Category, String> categoryUrls = new HashMap<>();
        categoryUrls.put(category, "http://lidoPizza.lv");
        categoryUrls.put(category1, "http://lidoBBQ.lv");

        Map<Category, String> categoryUrls1 = new HashMap<>();
        categoryUrls.put(category2, "http://SteakHouse/Salat");
        categoryUrls.put(category1, "http://StakeHouse/BBQ.lv");

        Rating rating = new Rating(null, 10, null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));
        Rating rating2 = new Rating(null, 5, null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));

        Set<Rating> ratings1 = new HashSet<>();
        ratings1.add(rating);
        Set<Rating> ratings2 = new HashSet<>();
        ratings2.add(rating2);

        Comment comment = new Comment(null, "Horoso", null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));
        Comment comment2 = new Comment(null, "Ploho", null, null, new Audit(LocalDateTime.now(), LocalDateTime.now()));

        Set<Comment> commentSet = new HashSet<>();
        commentSet.add(comment);

        Set<Comment> commentSet2 = new HashSet<>();
        commentSet2.add(comment2);

        WorkDay workDay1 = new WorkDay(null, DayOfWeek.FRIDAY, LocalTime.MIN, LocalTime.MAX, null);
        WorkDay workDay2 = new WorkDay(null, DayOfWeek.SATURDAY, LocalTime.MIN, LocalTime.MAX, null);

        Set<WorkDay> workDays = new HashSet<>();
        workDays.add(workDay1);
        Set<WorkDay> workDays1 = new HashSet<>();
        workDays1.add(workDay2);


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
                categoryUrls,
                ratings1,
                commentSet,
                workDays,
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
                categoryUrls1,
                ratings2,
                commentSet2,
                workDays1,
                new Audit(LocalDateTime.now(), LocalDateTime.now()));

        UserRole userRole = new UserRole(null, null, SecurityRole.ADMIN);
        UserRole userRole2 = new UserRole(null, null, SecurityRole.MANAGER);
        UserRole userRole3 = new UserRole(null, null, SecurityRole.MANAGER);

        UserRole u1 = userRoleDao.save(userRole);
        UserRole u2 = userRoleDao.save(userRole2);
        UserRole u3 = userRoleDao.save(userRole3);

        Set<UserRole> userRoles1 = new HashSet<>();
        userRoles1.add(u1);
        userRoles1.add(u2);

        Set<UserRole> userRoles2 = new HashSet<>();
        userRoles2.add(u2);
        userRoles2.add(u3);

        User user1 = new User(null,
                "Vladlens",
                "Filimonovs",
                "1234",
                "vladlenfilimonov@gmail.com",
                "AnonymousX",
                null,
                null,
                null,
                new Audit(LocalDateTime.now(), LocalDateTime.now())
        );

        User user2 = new User(null,
                "Dmitrijs",
                "Jakovlevs",
                "1234",
                "email",
                "login",
                null,
                null,
                null,
                new Audit(LocalDateTime.now(), LocalDateTime.now())
        );


        userDao.save(user1);
        userDao.save(user2);

        restaurantDao.save(restaurant);
        restaurantDao.save(restaurant2);
    }
}
