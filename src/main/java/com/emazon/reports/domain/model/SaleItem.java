package com.emazon.reports.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleItem {
    private String itemId;
    private Long quantity;
    private Double unitPrice;
    private Double subTotal;


    public SaleItem() {
        //for frameworks etc
    }

    public void calculateSubTotal(){
        this.subTotal = this.unitPrice*this.quantity;
    }
}
