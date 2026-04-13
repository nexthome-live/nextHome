package com.nexthome.app.dto;

public record VacancyCreateResponse(
        VacancyResponse vacancy,
        String managementToken
) {
}
