package com.emazon.reports.domain.usecase;

import com.emazon.reports.domain.api.ISaleReportServicePort;
import com.emazon.reports.domain.model.SaleReport;
import com.emazon.reports.domain.spi.ISaleReportPersistentPort;

public class SaleReportUseCase implements ISaleReportServicePort {
    private final ISaleReportPersistentPort saleReportPersistentPort;

    public SaleReportUseCase(ISaleReportPersistentPort saleReportPersistentPort) {
        this.saleReportPersistentPort = saleReportPersistentPort;
    }

    @Override
    public void save(SaleReport saleReport) {
        saleReportPersistentPort.save(saleReport);
    }
}
