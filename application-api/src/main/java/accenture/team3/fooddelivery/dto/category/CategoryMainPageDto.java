package accenture.team3.fooddelivery.dto.category;

public class CategoryMainPageDto {

    private Long id;
    private String name;
    private String pictureURL;
    private int allRestaurants;
    private int workedRestaurants;

    public CategoryMainPageDto() {
    }

    public CategoryMainPageDto(Long id, String name, String pictureURL, int allRestaurants, int workedRestaurants) {
        this.id = id;
        this.name = name;
        this.pictureURL = pictureURL;
        this.allRestaurants = allRestaurants;
        this.workedRestaurants = workedRestaurants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public int getAllRestaurants() {
        return allRestaurants;
    }

    public void setAllRestaurants(int allRestaurants) {
        this.allRestaurants = allRestaurants;
    }

    public int getWorkedRestaurants() {
        return workedRestaurants;
    }

    public void setWorkedRestaurants(int workedRestaurants) {
        this.workedRestaurants = workedRestaurants;
    }
}
