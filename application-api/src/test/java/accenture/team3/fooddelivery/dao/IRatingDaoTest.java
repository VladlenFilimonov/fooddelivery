package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.Application;
import accenture.team3.fooddelivery.domain.Rating;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest({"server.port=9090", "management.port=9090"})
@Transactional
public class IRatingDaoTest {
    @Autowired
    private RatingDao ratingDao;

    private Rating ratingFromDB;
    private Rating ratingForSave;


    @Before
    public void before() {
        ratingForSave = new Rating();
        ratingForSave.setValue(5);
    }


    @Test
    public void should_returnExistedCategoryAfterSave() {
        ratingFromDB = ratingDao.save(ratingForSave);
        assertNotNull(ratingFromDB);
    }

}