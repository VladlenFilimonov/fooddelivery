package accenture.team3.fooddelivery.shared.category;

import lombok.Data;

@Data
public class CategoryMainPageDto {

    private Long id;
    private String name;
    private String pictureURL;
    private int allRestaurants;
    private int workedRestaurants;

}