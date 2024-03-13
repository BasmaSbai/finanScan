package com.finanScan.finanScan.controllers.dto;

import com.finanScan.finanScan.domain.entities.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProfilDto {
    private Long id;

    private String firstName;

    private String lastName;

    private LocalDateTime birthDay;

    private UserDto user;
}
