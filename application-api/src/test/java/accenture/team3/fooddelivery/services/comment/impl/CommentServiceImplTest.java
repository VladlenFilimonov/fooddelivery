//package accenture.team3.fooddelivery.services.comment.impl;
//
//import accenture.team3.fooddelivery.dao.CommentDao;
//import accenture.team3.fooddelivery.dao.RestaurantDao;
//import accenture.team3.fooddelivery.domain.Comment;
//import accenture.team3.fooddelivery.domain.Restaurant;
//import accenture.team3.fooddelivery.domain.User;
//import accenture.team3.fooddelivery.domain.embedded.Audit;
//import accenture.team3.fooddelivery.shared.comment.CommentDto;
//import com.google.common.collect.Sets;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import java.time.LocalDateTime;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class CommentServiceImplTest {
//
//    CommentServiceImpl csi;
//    private CommentDao commentDao = mock(CommentDao.class);
//    private RestaurantDao restaurantDao = mock(RestaurantDao.class);
//    private Restaurant restaurant;
//    private Comment comment;
//    private CommentDto cDto;
//
//    @Before
//    public void setUp() throws Exception {
//        restaurant = new Restaurant();
//        comment = new Comment();
//        comment.setContent("Some content");
//        comment.setId(1l);
//        comment.setAudit(new Audit(LocalDateTime.MAX, LocalDateTime.MAX));
//        comment.setRestaurant(new Restaurant());
//        comment.setUser(new User());
//
//        cDto = new CommentDto(comment);
//
//        restaurant.setComments(Sets.newHashSet(comment));
//        when(restaurantDao.findOne(1l)).thenReturn(restaurant);
//        when(commentDao.findAllByRestaurant(restaurant)).thenReturn(Arrays.asList(comment));
//        csi = new CommentServiceImpl(commentDao, restaurantDao);
//    }
//
//    @Test
//    public void should_returnListOfCommentDto() {
//        List<CommentDto> c = csi.getComments(1l);
//        assertEquals(1, c.size());
//        assertEquals("Some content", c.get(0).getContent());
//        assertEquals(cDto, c.get(0));
//        cDto.setContent("Different Set");
//        assertNotEquals(cDto, c.get(0));
//    }
//
//}