package com.emazon.reports.infraestructure.controller;

import com.emazon.reports.application.handler.ISaleReportHandler;
import com.emazon.reports.domain.model.SaleReport;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/api/v1/report/")
public class SaleReportController {
    private final ISaleReportHandler saleReportHandler;

    @PostMapping("new/sale")
    public ResponseEntity<String>tryPostingSomething(@RequestBody SaleReport saleReportDto){
        saleReportHandler.save(saleReportDto);
        return ResponseEntity.ok("Created SaleReport");
    }
}
