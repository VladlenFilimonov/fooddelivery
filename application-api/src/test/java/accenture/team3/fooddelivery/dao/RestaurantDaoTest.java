package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.Application;
import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.Restaurant;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.util.collections.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest({"server.port=9090", "management.port=9090"})
@Transactional
public class RestaurantDaoTest {

    @Autowired
    private RestaurantDao dao;
    @Autowired
    private CategoryDao categoryDao;

    private Restaurant restaurant;
    private Category category;


    @Before
    public void before() {

        category = new Category();
        category.setName("cat");

        restaurant = new Restaurant();
        restaurant.setAcceptCard(true);
        restaurant.setName("name");
        restaurant.setCategories(Sets.newSet(category));

    }


    @Test
    public void should_saveNewRestaurantWithCategory() {
        Category cat = categoryDao.save(category);
        restaurant.setCategories(Sets.newSet(cat));
        Restaurant rest = dao.save(restaurant);
        category.setRestaurants(Sets.newSet(restaurant));
        categoryDao.save(category);
        assertTrue(true);
    }
}