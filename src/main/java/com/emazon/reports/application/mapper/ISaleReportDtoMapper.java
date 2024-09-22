package com.emazon.reports.application.mapper;

import com.emazon.reports.application.dto.SaleReportDto;
import com.emazon.reports.domain.model.SaleReport;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ISaleReportDtoMapper {
    SaleReportDto saleReportToSaleReportDto(SaleReport saleReport);
    SaleReport saleReportDtoToSaleReport(SaleReportDto saleReportDto);
}
