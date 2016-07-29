//package accenture.team3.fooddelivery.utils;
//
//import accenture.team3.fooddelivery.dao.*;
//import accenture.team3.fooddelivery.domain.Delivery;
//import accenture.team3.fooddelivery.domain.Restaurant;
//import accenture.team3.fooddelivery.domain.classifier.Status;
//import accenture.team3.fooddelivery.domain.embedded.Audit;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//
//@Service
//@Transactional
//public class TempDb2 {
//    private CategoryDao categoryDao;
//    private CommentDao commentDao;
//    private ContactInfoDao contactInfoDao;
//    private DeliveryDao deliveryDao;
//    private RatingDao ratingDao;
//    private RestaurantDao restaurantDao;
//    private ScheduleDao scheduleDao;
//    private UserDao userDao;
//    private UserRoleDao userRoleDao;
//
//    @Autowired
//    public TempDb2(CategoryDao categoryDao, CommentDao commentDao, ContactInfoDao contactInfoDao, DeliveryDao deliveryDao, RatingDao ratingDao, RestaurantDao restaurantDao, ScheduleDao scheduleDao, UserDao userDao, UserRoleDao userRoleDao) {
//        this.categoryDao = categoryDao;
//        this.commentDao = commentDao;
//        this.contactInfoDao = contactInfoDao;
//        this.deliveryDao = deliveryDao;
//        this.ratingDao = ratingDao;
//        this.restaurantDao = restaurantDao;
//        this.scheduleDao = scheduleDao;
//        this.userDao = userDao;
//        this.userRoleDao = userRoleDao;
//    }
//
//    public void createDb(){
//        Restaurant restaurant = new Restaurant(
//                null,
//                "Lido",
//                "lido.png",
//                new Delivery(null,
//                        new BigDecimal(25.00),
//                        true,
//                        LocalTime.MIN,
//                        LocalTime.MAX,
//                        "27744332"
//                ),
//                true,
//                Status.ACTIVE,
//                null,
//                null,
//                null,
//                null,
//                null,
//                new Audit(LocalDateTime.now(), LocalDateTime.now()));
//
//        Restaurant restaurant2 = new Restaurant(
//                null,
//                "SteakHouse",
//                "steak_house.png",
//                new Delivery(null,
//                        new BigDecimal(25.00),
//                        true,
//                        LocalTime.MIN,
//                        LocalTime.MAX,
//                        "27744332"
//                ),
//                true,
//                Status.ACTIVE,
//                null,
//                null,
//                null,
//                null,
//                null,
//                new Audit(LocalDateTime.now(), LocalDateTime.now()));
//    }
//}
