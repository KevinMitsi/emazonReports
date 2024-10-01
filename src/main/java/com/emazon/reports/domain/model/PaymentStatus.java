package com.emazon.reports.domain.model;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    STATUS_PAID,
    STATUS_PENDING,
    STATUS_CANCELLED
}
