package com.ecommerce.ecommanalyticsservice.repository;

import com.ecommerce.ecommanalyticsservice.entity.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalyticsRepository extends JpaRepository<Analytics, Integer> {
}
