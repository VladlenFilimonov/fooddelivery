package accenture.team3.fooddelivery.dto.admin.users;

public class RestaurantListForUsersDto {
    private Long id;
    private String name;

    public RestaurantListForUsersDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public RestaurantListForUsersDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
