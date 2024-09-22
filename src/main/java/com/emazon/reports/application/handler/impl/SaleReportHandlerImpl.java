package com.emazon.reports.application.handler.impl;

import com.emazon.reports.application.dto.SaleReportDto;
import com.emazon.reports.application.handler.ISaleReportHandler;
import com.emazon.reports.application.mapper.ISaleReportDtoMapper;
import com.emazon.reports.domain.api.ISaleReportServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleReportHandlerImpl implements ISaleReportHandler {

    private final ISaleReportServicePort saleReportServicePort;
    private final ISaleReportDtoMapper saleReportDtoMapper;

    @Override
    public void save(SaleReportDto saleReportDto) {
        saleReportServicePort
                .save(saleReportDtoMapper.saleReportDtoToSaleReport(saleReportDto));
    }
}
