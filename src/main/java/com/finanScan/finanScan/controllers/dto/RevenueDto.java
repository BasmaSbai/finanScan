package com.finanScan.finanScan.controllers.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RevenueDto extends WalletDto{

    private TypeRevenueDto typeRevenue;
}
