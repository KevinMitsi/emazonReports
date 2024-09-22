package com.emazon.reports.infraestructure.repository;

import com.emazon.reports.infraestructure.entity.SaleReportEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISaleReportRepository extends MongoRepository<SaleReportEntity, String> {
}
