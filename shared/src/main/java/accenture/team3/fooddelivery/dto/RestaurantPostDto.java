package accenture.team3.fooddelivery.dto;

import accenture.team3.fooddelivery.domain.Category;
import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.DeliveryTime;
import accenture.team3.fooddelivery.domain.restaurantDependencies.WorkWeek;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

/**
 * Created by student007 on 16.21.7.
 */
public class RestaurantPostDto {

    @Id
    private Long id;
    private String name;
    private String url;
    //    private String phone;
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

//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }

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

}
