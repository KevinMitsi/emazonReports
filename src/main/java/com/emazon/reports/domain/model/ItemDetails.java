package com.emazon.reports.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDetails {
    private String id;
    private String name;
    private Long price;


    public ItemDetails() {
        //for frameworks etc
    }
}
