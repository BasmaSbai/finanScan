package com.finanScan.finanScan.controllers.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ThresholdDto {
    private Long id;

    private Double max;

    private UserDto user;

    private CategoryDto category;
}
