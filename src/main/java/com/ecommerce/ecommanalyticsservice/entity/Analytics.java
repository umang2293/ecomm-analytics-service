package com.ecommerce.ecommanalyticsservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "tbl_analytics")
public class Analytics {
    @Id
    @Size(max = 50)
    @Column(name = "objectid", nullable = false, length = 50)
    private String objectid;

    @Size(max = 50)
    @Column(name = "event", length = 50)
    private String event;

    @Column(name = "productid")
    private Integer productid;

    @Column(name = "timestamp")
    private LocalTime timestamp;

    @Size(max = 50)
    @Column(name = "message", length = 50)
    private String message;

}