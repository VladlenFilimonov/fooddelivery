package accenture.team3.fooddelivery.shared.restaurant;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RestaurantGetDtoTest {

    RestaurantGetDto restaurantGetDto = new RestaurantGetDto();

    @Test
    public void should_convertHoursToTime() {
        LocalTime localTime = LocalTime.of(1, 40);
        assertEquals(100, restaurantGetDto.convertHoursInMinutes(localTime));
        assertNotEquals(130, restaurantGetDto.convertHoursInMinutes(localTime));
    }

}