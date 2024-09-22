package com.emazon.reports.infraestructure.mapper;

import com.emazon.reports.domain.model.SaleReport;
import com.emazon.reports.infraestructure.entity.SaleReportEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ISaleReportEntityMapper {
    SaleReport saleReportEntityToSaleReport(SaleReportEntity saleReportEntity);

    SaleReportEntity saleReportToSaleReportEntity(SaleReport saleReport);
}
