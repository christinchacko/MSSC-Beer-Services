package com.springframework.msscbeerservices.Domain;

import com.springframework.msscbeerservices.web.model.beerStyleEnum;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    @Id
    @GeneratedValue
    @Column(length = 36,columnDefinition = "varchar",updatable = false, nullable = false)
    private UUID id;
    @Version
    private Long version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createDate;
    @UpdateTimestamp
    private Timestamp lastModifiedDate;
    @NotNull
    private String beerName;

    private String beerStyle;

    @Column(unique = true)
    private long upc;

    private BigDecimal price;
    private Integer minOnHand;
    private Integer quatityOnBrew;

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", version=" + version +
                ", createDate=" + createDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", beerName='" + beerName + '\'' +
                ", beerStyle='" + beerStyle + '\'' +
                ", upc=" + upc +
                ", price=" + price +
                ", minOnHand=" + minOnHand +
                ", quatityOnBrew=" + quatityOnBrew +
                '}';
    }
}
