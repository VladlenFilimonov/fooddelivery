package accenture.team3.fooddelivery.dto.category;

public class CategoryDto {

    private Long id;
    private String name;
    private String pictureURL;

    public CategoryDto() {
    }

    public CategoryDto(Long id, String name, String pictureURL) {
        this.id = id;
        this.name = name;
        this.pictureURL = pictureURL;
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
}
