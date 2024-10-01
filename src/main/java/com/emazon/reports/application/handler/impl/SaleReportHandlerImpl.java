package com.emazon.reports.application.handler.impl;

import com.emazon.reports.application.handler.ISaleReportHandler;
import com.emazon.reports.domain.api.ISaleReportServicePort;
import com.emazon.reports.domain.model.SaleReport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleReportHandlerImpl implements ISaleReportHandler {

    private final ISaleReportServicePort saleReportServicePort;
    @Override
    public void save(SaleReport saleReportDto) {
        saleReportServicePort
                .save(saleReportDto);
    }
}
