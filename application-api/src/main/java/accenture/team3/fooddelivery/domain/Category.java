package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String pictureURL;
    private byte status;
    @Embedded
    private CreateUpdateTime createUpdateTime;
    //    @ManyToMany(mappedBy = "categories")
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name="CATEGORY_RESTAURANTS",
//            joinColumns={@JoinColumn(name="CATEGORY_ID")},
//            inverseJoinColumns={@JoinColumn(name="RESTAURANTS_ID")})
    @ManyToMany
    private Set<Restaurant> restaurants;

    public Category() {
    }

    public Category(byte status, Long id, String name, String pictureURL, CreateUpdateTime createUpdateTime, Set<Restaurant> restaurants) {
        this.status = status;
        this.id = id;
        this.name = name;
        this.pictureURL = pictureURL;
        this.createUpdateTime = createUpdateTime;
        this.restaurants = restaurants;
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }

    //    @ManyToMany(mappedBy = "categories")
    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (status != category.status) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return pictureURL != null ? pictureURL.equals(category.pictureURL) : category.pictureURL == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (pictureURL != null ? pictureURL.hashCode() : 0);
        result = 31 * result + (int) status;
        return result;
    }
}
