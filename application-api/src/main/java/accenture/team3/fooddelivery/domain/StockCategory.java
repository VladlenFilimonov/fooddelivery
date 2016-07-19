package accenture.team3.fooddelivery.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stock_category")
@AssociationOverrides({
        @AssociationOverride(name = "pk.stock",
                joinColumns = @JoinColumn(name = "STOCK_ID")),
        @AssociationOverride(name = "pk.category",
                joinColumns = @JoinColumn(name = "CATEGORY_ID"))})
public class StockCategory implements java.io.Serializable {

    private StockCategoryId pk = new StockCategoryId();
    private Date createdDate;
    private String createdBy;

    public StockCategory() {
    }

    @EmbeddedId
    public StockCategoryId getPk() {
        return pk;
    }

    public void setPk(StockCategoryId pk) {
        this.pk = pk;
    }

    @Transient
    public Stock getStock() {
        return getPk().getStock();
    }

    public void setStock(Stock stock) {
        getPk().setStock(stock);
    }

    @Transient
    public Category getCategory() {
        return getPk().getCategory();
    }

    public void setCategory(Category category) {
        getPk().setCategory(category);
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE", nullable = false, length = 10)
    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "CREATED_BY", nullable = false, length = 10)
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        StockCategory that = (StockCategory) o;

        return getPk() != null ? getPk().equals(that.getPk()) : that.getPk() == null;

    }

    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }
}
