package com.emazon.reports.infraestructure.entity;

import com.emazon.reports.domain.model.ItemDetails;
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
    private String userEmail;

    private Date creationDate;

    @Indexed
    private Long total;

    private List<ItemDetails> itemDetails;

    @Indexed
    private Date saleDate;
}
