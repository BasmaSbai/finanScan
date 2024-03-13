package com.finanScan.finanScan.controllers.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {
    private Long id;

    private String email;

    private String password;

    private ProfilDto profil;

    private List<SettingDto> setting;

    private List<ThresholdDto> thresholds;
}
