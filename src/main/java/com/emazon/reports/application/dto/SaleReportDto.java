package com.emazon.reports.application.dto;

import com.emazon.reports.domain.model.ItemDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleReportDto {
    private String id;
    private String userEmail;
    private Date creationDate;
    private Long total;
    private List<ItemDetails> itemDetails;
    private Date saleDate;
}
