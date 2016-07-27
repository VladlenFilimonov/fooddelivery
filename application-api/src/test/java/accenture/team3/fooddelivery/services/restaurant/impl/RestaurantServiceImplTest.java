package accenture.team3.fooddelivery.services.restaurant.impl;

import accenture.team3.fooddelivery.dao.RestaurantDao;
import accenture.team3.fooddelivery.domain.Restaurant;
import accenture.team3.fooddelivery.services.restaurant.dto.RestaurantDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantServiceImplTest {

    ModelMapper mapper = new ModelMapper();
    RestaurantDao dao = mock(RestaurantDao.class);

    RestaurantServiceImpl service = new RestaurantServiceImpl(dao, mapper);

    Restaurant restaurant0;
    Restaurant restaurant1;

    @Before
    public void before() {
        restaurant0 = new Restaurant();
        restaurant0.setName("rest_name0");

        restaurant1 = new Restaurant();
        restaurant1.setName("rest_name1");

        when(dao.findAll()).thenReturn(Arrays.asList(restaurant0, restaurant1));
    }

    @Test
    public void should_correctlyMapStreamToDTO() {

        Stream<RestaurantDto> dtoStream = service.findAll();
        assertEquals(2L, dtoStream.count());
    }
}