package accenture.team3.fooddelivery.config;

import accenture.team3.fooddelivery.dao.*;
import accenture.team3.fooddelivery.utils.TempDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public TempDatabase tempDatabase(CategoryDao categoryDao,
                                     CommentDao commentDao,
                                     ContactInfoDao contactInfoDao,
                                     DeliveryDao deliveryDao,
                                     RatingDao ratingDao,
                                     RestaurantDao restaurantDao,
                                     ScheduleDao scheduleDao,
                                     UserDao userDao,
                                     UserRoleDao userRoleDao) {

        TempDatabase db = new TempDatabase(
                categoryDao,
                commentDao,
                contactInfoDao,
                deliveryDao,
                ratingDao,
                restaurantDao,
                scheduleDao,
                userDao,
                userRoleDao
        );
        return db;
    }

    @Autowired
    public void init(TempDatabase db) {
        db.createDb();
    }

}
