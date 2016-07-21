package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.WorkWeek;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

@Entity
public class Restaurant {

    @Id
    private Long id;
    private String name;
    private String url;
    private String phone;
    @Embedded
    private DeliveryTime deliveryTime;
    //@Embedded
    @Transient
    private WorkWeek workWeek;
    private BigDecimal freeDeliveryFrom;
    private boolean freeDeliveryWithClientCard;
    private boolean cardPay;
    @Embedded
    private SystemDateTime systemDateTime;
    @ElementCollection
    private Map<Long, String> categoryURL;
    @ManyToMany
    @JoinTable(name = "RESTAURANT_CATEGORY")
    @JsonIgnore
    private Set<Category> categories;
    private String logoUrl;
    private byte status;

    public Restaurant() {
    }

    public Restaurant(Long id, String name, String url, String phone, DeliveryTime deliveryTime, WorkWeek workWeek, BigDecimal freeDeliveryFrom, boolean freeDeliveryWithClientCard, boolean cardPay, SystemDateTime systemDateTime, Map<Long, String> categoryURL, Set<Category> categories, String logoUrl, byte status) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.phone = phone;
        this.deliveryTime = deliveryTime;
        this.workWeek = workWeek;
        this.freeDeliveryFrom = freeDeliveryFrom;
        this.freeDeliveryWithClientCard = freeDeliveryWithClientCard;
        this.cardPay = cardPay;
        this.systemDateTime = systemDateTime;
        this.categoryURL = categoryURL;
        this.categories = categories;
        this.logoUrl = logoUrl;
        this.status = status;
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

    public WorkWeek getWorkWeek() {
        return workWeek;
    }

    public void setWorkWeek(WorkWeek workWeek) {
        this.workWeek = workWeek;
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

    public SystemDateTime getSystemDateTime() {
        return systemDateTime;
    }

    public void setSystemDateTime(SystemDateTime systemDateTime) {
        this.systemDateTime = systemDateTime;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (freeDeliveryWithClientCard != that.freeDeliveryWithClientCard) return false;
        if (cardPay != that.cardPay) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        return freeDeliveryFrom != null ? freeDeliveryFrom.equals(that.freeDeliveryFrom) : that.freeDeliveryFrom == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (freeDeliveryFrom != null ? freeDeliveryFrom.hashCode() : 0);
        result = 31 * result + (freeDeliveryWithClientCard ? 1 : 0);
        result = 31 * result + (cardPay ? 1 : 0);
        return result;
    }
}