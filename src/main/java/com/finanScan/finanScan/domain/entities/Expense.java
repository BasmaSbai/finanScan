package com.finanScan.finanScan.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense extends Wallet{

    @OneToOne(cascade = CascadeType.MERGE)
    private Category category;

    @OneToOne(cascade = CascadeType.MERGE)
    private TypeExpense typeExpense;
}
