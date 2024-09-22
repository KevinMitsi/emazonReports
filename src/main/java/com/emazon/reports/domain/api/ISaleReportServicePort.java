package com.emazon.reports.domain.api;

import com.emazon.reports.domain.model.SaleReport;

public interface ISaleReportServicePort {
    void save(SaleReport saleReport);
}
