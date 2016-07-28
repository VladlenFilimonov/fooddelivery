//package accenture.team3.fooddelivery.services.restaurant.dto;
//
//import accenture.team3.fooddelivery.domain.WorkDay;
//import accenture.team3.fooddelivery.domain.classifier.Status;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.internal.util.collections.Sets;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//public class RestaurantGetDtoTest {
//
//    private RestaurantDto r0;
//    private RestaurantDto r1;
//    private RestaurantDto r2;
//
//
//    @Before
//    public void before() {
//        WorkDay wd0 = new WorkDay();
//        wd0.setDay(LocalDate.now().getDayOfWeek());
//        wd0.setOpenAt(LocalTime.MIN);
//        wd0.setCloseAt(LocalTime.MAX);
//
//        WorkDay wd1 = new WorkDay();
//        wd1.setDay(LocalDate.now().getDayOfWeek().minus(1));
//        wd1.setOpenAt(LocalTime.MIN);
//        wd1.setCloseAt(LocalTime.MAX);
//
//        WorkDay wd2 = new WorkDay();
//        wd2.setDay(LocalDate.now().getDayOfWeek());
//        wd2.setOpenAt(LocalTime.MIDNIGHT);
//        wd2.setCloseAt(LocalTime.MIDNIGHT);
//
//        r0 = new RestaurantDto();
//        r0.setWorkDays(Sets.newSet(wd0));
//        r0.setStatus(Status.ACTIVE);
//
//        r1 = new RestaurantDto();
//        r1.setWorkDays(Sets.newSet(wd1));
//        r1.setStatus(Status.ACTIVE);
//
//        r2 = new RestaurantDto();
//        r2.setWorkDays(Sets.newSet(wd2));
//        r2.setStatus(Status.ACTIVE);
//
//    }
//
//    @Test
//    public void should_correctlyReturnWorkingRestaurants() {
//
//        assertTrue(r0.isWorkingNow());
//        assertFalse(r1.isWorkingNow());
//        assertFalse(r2.isWorkingNow());
//
//    }
//
//}