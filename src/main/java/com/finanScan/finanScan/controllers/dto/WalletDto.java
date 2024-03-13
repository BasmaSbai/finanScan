package com.finanScan.finanScan.controllers.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WalletDto {
    private Long id;

    private String value;

    private LocalDateTime date;
}
