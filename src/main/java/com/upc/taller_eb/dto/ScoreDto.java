package com.upc.taller_eb.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ScoreDto {
    private Long id;
    private Long driverId;
    private Float value;
    private Date registeredAt;
}
