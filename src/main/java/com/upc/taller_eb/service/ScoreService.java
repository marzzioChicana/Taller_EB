package com.upc.taller_eb.service;

import com.upc.taller_eb.dto.ScoreDto;

import java.util.List;

public interface ScoreService {
    public abstract ScoreDto createScore(ScoreDto scoreDto);

    public abstract List<ScoreDto> getScoresByDriverId(Long driverId);

    public abstract Float getMaxScoreByDriverId(Long driverId);

    public abstract Float getAverageScoreByDriverId(Long driverId);
}
