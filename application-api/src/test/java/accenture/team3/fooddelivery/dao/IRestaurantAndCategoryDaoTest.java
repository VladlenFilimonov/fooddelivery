//package accenture.team3.fooddelivery.dao;
//
//import accenture.team3.fooddelivery.Application;
//import accenture.team3.fooddelivery.domain.Category;
//import accenture.team3.fooddelivery.domain.Restaurant;
//import com.google.common.collect.Sets;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.boot.test.WebIntegrationTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Application.class)
//@WebIntegrationTest({"server.port=9090", "management.port=9090"})
//@Transactional
//public class IRestaurantAndCategoryDaoTest {
//    @Autowired
//    private RestaurantDao restaurantDao;
//    @Autowired
//    private CategoryDao categoryDao;
//    private Category category1;
//    private Category category2;
//    private Restaurant restaurant;
//
//
//    @Before
//    public void setUp() throws Exception {
//        category1 = new Category();
//        category2 = new Category();
//
//        category1.setName("cat1");
//        category2.setName("cat2");
//        restaurant = new Restaurant();
//        restaurant.setName("rest");
//    }
//
//    @Test
//    public void should_saveRestaurantAndCategoryWithRelationManyToMany(){
//        categoryDao.save(Sets.newHashSet(category1, category2));
//        category1.setRestaurants(Sets.newHashSet(restaurant));
//        category2.setRestaurants(Sets.newHashSet(restaurant));
//        Restaurant restaurantFromDB = restaurantDao.save(restaurant);
//
//        assertEquals(2, restaurantFromDB.getCategories().size());
//    }
//
//}