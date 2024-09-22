package com.emazon.reports.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SaleReport {
    private String id;
    private String userEmail;
    private Date creationDate;
    private Long total;
    private List<ItemDetails> itemDetails;
    private Date saleDate;

    public SaleReport() {
        //for frameworks etc
    }
}
