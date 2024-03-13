package com.finanScan.finanScan.controllers.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SettingDto{
    private Long id;

    private String name;

    private String value;

    private UserDto user;
}
