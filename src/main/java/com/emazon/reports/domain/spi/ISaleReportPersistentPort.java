package com.emazon.reports.domain.spi;

import com.emazon.reports.domain.model.SaleReport;

public interface ISaleReportPersistentPort {
    void save(SaleReport saleReport);
}
