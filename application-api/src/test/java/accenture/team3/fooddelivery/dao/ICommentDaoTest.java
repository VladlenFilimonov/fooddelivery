package accenture.team3.fooddelivery.dao;

import accenture.team3.fooddelivery.Application;
import accenture.team3.fooddelivery.domain.Comment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest({"server.port=9090", "management.port=9090"})
@Transactional
public class ICommentDaoTest {

    @Autowired
    private RestaurantDao restaurantDao;
    @Autowired
    private CommentDao commentDao;
    private Comment comment1;

    @Before
    public void setUp() throws Exception {
        comment1 = new Comment();
        comment1.setContent("Text");
    }

    @Test
    public void should_saveCommentInToDatabase() {
        comment1.setContent("new text");
        Comment commentFromDB = commentDao.save(comment1);
        assertNotNull(commentFromDB);
        assertEquals(commentFromDB.getContent(), comment1.getContent());
    }

}