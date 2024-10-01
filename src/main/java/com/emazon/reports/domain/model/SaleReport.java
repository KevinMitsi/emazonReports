package com.emazon.reports.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SaleReport {
    private String id;

    private String user;

    private List<SaleItem> saleItems;

    private Date saleDate;
    private Double total;
    private PaymentStatus paymentStatus;
    public SaleReport() {
        //for frameworks etc
    }
}
