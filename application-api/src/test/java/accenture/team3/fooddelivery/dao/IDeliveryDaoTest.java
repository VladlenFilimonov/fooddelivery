package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.Application;
import accenture.team3.fooddelivery.domain.Delivery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest({"server.port=9090", "management.port=9090"})
@Transactional
public class IDeliveryDaoTest {

    @Autowired
    private DeliveryDao deliveryDao;

    private Delivery deliveryFromDb;
    private Delivery deliveryForSave;

    @Before
    public void setUp() throws Exception {
        deliveryForSave = new Delivery();
        deliveryForSave.setPhone("1234");
        deliveryForSave.setFreeByClientCard(true);
    }

    @Test
    public void should_saveDeliveryInToDatabase() {
        deliveryFromDb = deliveryDao.save(deliveryForSave);
        assertNotNull(deliveryFromDb);
        assertEquals(deliveryFromDb.getPhone(), "1234");
    }

}