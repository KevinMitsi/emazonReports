package com.emazon.reports.infraestructure.adapter;

import com.emazon.reports.domain.model.SaleReport;
import com.emazon.reports.domain.spi.ISaleReportPersistentPort;
import com.emazon.reports.infraestructure.mapper.ISaleReportEntityMapper;
import com.emazon.reports.infraestructure.repository.ISaleReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MongoSaleReportAdapter implements ISaleReportPersistentPort {
    private final ISaleReportRepository saleReportRepository;
    private final ISaleReportEntityMapper saleReportEntityMapper;

    @Override
    public void save(SaleReport saleReport) {
        saleReportRepository.save(saleReportEntityMapper.saleReportToSaleReportEntity(saleReport));
    }
}
