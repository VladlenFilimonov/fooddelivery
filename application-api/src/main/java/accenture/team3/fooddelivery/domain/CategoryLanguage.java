package accenture.team3.fooddelivery.domain;

import accenture.team3.fooddelivery.domain.commonDependencies.SystemDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoryLanguage {
    @Id
    private Long id;
    private String name;
    private byte status;
    @Embedded
    private SystemDateTime systemDateTime;
}
