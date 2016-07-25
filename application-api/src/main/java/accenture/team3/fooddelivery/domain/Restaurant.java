package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.CreateUpdateTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String url;
    private String phone;
    @Embedded
    private DeliveryTime deliveryTime;
    @OneToMany
    private Set<Schedule> schedule;
    private BigDecimal freeDeliveryFrom;
    private boolean freeDeliveryWithClientCard;
    private boolean cardPay;
    @Embedded
    private CreateUpdateTime createUpdateTime;
    @ElementCollection
    private Map<Long, String> categoryURL;
    @ManyToMany
    @JsonIgnore
    private Set<Category> categories;
    private String logoUrl;
    private byte status;
    @OneToMany
    private Set<Rating> rating;
    @OneToMany
    private Set<Comment> comment;
    @ManyToOne
    private User user;

    public Restaurant() {
    }

    public Restaurant(String name, String url, String phone, DeliveryTime deliveryTime, Set<Schedule> schedule, BigDecimal freeDeliveryFrom, boolean freeDeliveryWithClientCard, boolean cardPay, CreateUpdateTime createUpdateTime, Map<Long, String> categoryURL, Set<Category> categories, String logoUrl, byte status, Set<Rating> rating, Set<Comment> comment, User user) {
        this.name = name;
        this.url = url;
        this.phone = phone;
        this.deliveryTime = deliveryTime;
        this.schedule = schedule;
        this.freeDeliveryFrom = freeDeliveryFrom;
        this.freeDeliveryWithClientCard = freeDeliveryWithClientCard;
        this.cardPay = cardPay;
        this.createUpdateTime = createUpdateTime;
        this.categoryURL = categoryURL;
        this.categories = categories;
        this.logoUrl = logoUrl;
        this.status = status;
        this.rating = rating;
        this.comment = comment;
        this.user = user;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DeliveryTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(DeliveryTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Set<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(Set<Schedule> schedule) {
        this.schedule = schedule;
    }

    public BigDecimal getFreeDeliveryFrom() {
        return freeDeliveryFrom;
    }

    public void setFreeDeliveryFrom(BigDecimal freeDeliveryFrom) {
        this.freeDeliveryFrom = freeDeliveryFrom;
    }

    public boolean isFreeDeliveryWithClientCard() {
        return freeDeliveryWithClientCard;
    }

    public void setFreeDeliveryWithClientCard(boolean freeDeliveryWithClientCard) {
        this.freeDeliveryWithClientCard = freeDeliveryWithClientCard;
    }

    public boolean isCardPay() {
        return cardPay;
    }

    public void setCardPay(boolean cardPay) {
        this.cardPay = cardPay;
    }

    public CreateUpdateTime getCreateUpdateTime() {
        return createUpdateTime;
    }

    public void setCreateUpdateTime(CreateUpdateTime createUpdateTime) {
        this.createUpdateTime = createUpdateTime;
    }

    public Map<Long, String> getCategoryURL() {
        return categoryURL;
    }

    public void setCategoryURL(Map<Long, String> categoryURL) {
        this.categoryURL = categoryURL;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Set<Rating> getRating() {
        return rating;
    }

    public void setRating(Set<Rating> rating) {
        this.rating = rating;
    }

    public Set<Comment> getComment() {
        return comment;
    }

    public void setComment(Set<Comment> comment) {
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (freeDeliveryWithClientCard != that.freeDeliveryWithClientCard) return false;
        if (cardPay != that.cardPay) return false;
        if (status != that.status) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (deliveryTime != null ? !deliveryTime.equals(that.deliveryTime) : that.deliveryTime != null) return false;
        if (freeDeliveryFrom != null ? !freeDeliveryFrom.equals(that.freeDeliveryFrom) : that.freeDeliveryFrom != null)
            return false;
        if (createUpdateTime != null ? !createUpdateTime.equals(that.createUpdateTime) : that.createUpdateTime != null)
            return false;
        if (categoryURL != null ? !categoryURL.equals(that.categoryURL) : that.categoryURL != null) return false;
        return logoUrl != null ? logoUrl.equals(that.logoUrl) : that.logoUrl == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (deliveryTime != null ? deliveryTime.hashCode() : 0);
        result = 31 * result + (freeDeliveryFrom != null ? freeDeliveryFrom.hashCode() : 0);
        result = 31 * result + (freeDeliveryWithClientCard ? 1 : 0);
        result = 31 * result + (cardPay ? 1 : 0);
        result = 31 * result + (createUpdateTime != null ? createUpdateTime.hashCode() : 0);
        result = 31 * result + (categoryURL != null ? categoryURL.hashCode() : 0);
        result = 31 * result + (logoUrl != null ? logoUrl.hashCode() : 0);
        result = 31 * result + (int) status;
        return result;
    }
}