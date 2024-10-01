package com.emazon.reports.infraestructure.adapter;

import com.emazon.reports.domain.model.SaleItem;
import com.emazon.reports.domain.model.SaleReport;
import com.emazon.reports.domain.spi.ISaleReportPersistentPort;
import com.emazon.reports.infraestructure.entity.SaleReportEntity;
import com.emazon.reports.infraestructure.mapper.ISaleReportEntityMapper;
import com.emazon.reports.infraestructure.repository.ISaleReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Date;

@Repository
@RequiredArgsConstructor
public class MongoSaleReportAdapter implements ISaleReportPersistentPort {
    public static final Date ACTUAL_DATE = Date.from(Instant.now());
    private final ISaleReportRepository saleReportRepository;
    private final ISaleReportEntityMapper saleReportEntityMapper;

    @Override
    public void save(SaleReport saleReport) {
        saleReportRepository.save(prepareSaleEntity(saleReport));
    }
    private SaleReportEntity prepareSaleEntity(SaleReport saleReport) {
        SaleReportEntity saleReportEntity = saleReportEntityMapper.saleReportToSaleReportEntity(saleReport);
        saleReportEntity.setCreationDate(ACTUAL_DATE);
        saleReportEntity.setItemDetails(saleReport.getSaleItems());
        saleReportEntity.calculateTotal();
        return saleReportEntity;
    }
}
