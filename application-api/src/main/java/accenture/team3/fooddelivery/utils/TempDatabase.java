package accenture.team3.fooddelivery.utils;

import accenture.team3.fooddelivery.dao.*;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.domain.WorkDay;
import com.google.common.collect.Sets;
import org.springframework.transaction.annotation.Transactional;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
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

        List<Restaurant> restaurants = (List<Restaurant>) restaurantDao.findAll();
        restaurants.forEach(r -> {
            r.setWorkDays(createWorkDay(r));
            if (r.getId() % 7 == 0) {
                r.getDelivery().setTimeMin(LocalTime.of(0, 30));
                r.getDelivery().setTimeMax(LocalTime.of(1, 0));
            } else if (r.getId() % 6 == 0) {
                r.getDelivery().setTimeMin(LocalTime.of(0, 40));
                r.getDelivery().setTimeMax(LocalTime.of(1, 20));
            } else if (r.getId() % 3 == 0) {
                r.getDelivery().setTimeMin(LocalTime.of(1, 0));
                r.getDelivery().setTimeMax(LocalTime.of(2, 0));
            } else if (r.getId() % 9 == 0) {
                r.getDelivery().setTimeMin(LocalTime.of(0, 50));
                r.getDelivery().setTimeMax(LocalTime.of(1, 40));
            } else {
                r.getDelivery().setTimeMin(LocalTime.of(0, 45));
                r.getDelivery().setTimeMax(LocalTime.of(1, 50));
            }

        });
        WorkDay workDay = new WorkDay();
        workDay.setDay(DayOfWeek.FRIDAY);
        workDay.setOpenAt(LocalTime.MAX);
        workDay.setCloseAt(LocalTime.MAX);
        restaurants.forEach(r -> {
            if (r.getId() % 7 == 0) {
                workDay.setRestaurant(r);
                r.setWorkDays(Sets.newHashSet());
            }
        });
        restaurants.forEach(r -> {
            if (r.isWorkingNow()) {
                System.out.println("cool");
            } else {
                System.out.println("bad");
            }
        });
        restaurantDao.save(restaurants);

    }

    private Set<WorkDay> createWorkDay(Restaurant restaurant) {
        Set<WorkDay> workDays = new HashSet<>();
        for (int i = 0; i < 7; i++) {
            if (i % 4 != 0) {
                workDays.add(new WorkDay(null,
                        DayOfWeek.values()[i],
                        LocalTime.of(1, 0),
                        LocalTime.of(23, 0), restaurant));
            } else workDays.add(new WorkDay(null,
                    DayOfWeek.values()[i],
                    LocalTime.of(1, 0),
                    LocalTime.of(20, 0), restaurant));
        }
        return workDays;
    }
}
