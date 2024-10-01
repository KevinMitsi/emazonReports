package com.emazon.reports.domain.usecase;

import com.emazon.reports.domain.model.SaleReport;
import com.emazon.reports.domain.spi.ISaleReportPersistentPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SaleReportUseCaseTest {
    @Mock
    ISaleReportPersistentPort saleReportPersistentPort;
    @InjectMocks
    SaleReportUseCase saleReportUseCase;


    @Test
    void Should_Save_SaleReport(){
        SaleReport anySaleReport = any(SaleReport.class);
        saleReportUseCase.save(anySaleReport);
        verify(saleReportPersistentPort.save(anySaleReport), times(1));
    }
}