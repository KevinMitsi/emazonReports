package com.emazon.reports.infraestructure.entity;

import com.emazon.reports.domain.model.PaymentStatus;
import com.emazon.reports.domain.model.SaleItem;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "sale-report")
public class SaleReportEntity {
    @Id
    private String id;

    @Indexed
    private String user;

    private Date creationDate;

    private List<SaleItem> itemDetails;

    @Indexed
    private Double total;
    @Indexed
    private PaymentStatus paymentStatus;
    @Indexed
    private Date saleDate;

    public void calculateTotal(){
        this.total = 0D;
        for (SaleItem si : this.itemDetails){
            si.calculateSubTotal();
            total+= si.getSubTotal();
        }
    }
}
