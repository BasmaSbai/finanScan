package com.finanScan.finanScan.controllers.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoryDto {
    private Long id;

    private String name;

    private List<ThresholdDto> thresholds;
}
