package com.emazon.reports.infraestructure.config;

import com.emazon.reports.domain.api.ISaleReportServicePort;
import com.emazon.reports.domain.spi.ISaleReportPersistentPort;
import com.emazon.reports.domain.usecase.SaleReportUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {
    @Bean
    ISaleReportServicePort saleReportServicePort(ISaleReportPersistentPort saleReportPersistentPort){
        return new SaleReportUseCase(saleReportPersistentPort);
    }
}
