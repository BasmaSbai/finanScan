package com.finanScan.finanScan.controllers.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ExpenseDto extends WalletDto {

    private CategoryDto category;

    private TypeExpenseDto typeExpense;
}
