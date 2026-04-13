package com.nexthome.app.service;

import com.nexthome.app.dto.VacancyResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    private final VacancyService vacancyService;

    public SearchService(VacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    public List<VacancyResponse> nearby(double latitude, double longitude, double radiusKm) {
        return vacancyService.list(null, latitude, longitude, radiusKm);
    }
}
