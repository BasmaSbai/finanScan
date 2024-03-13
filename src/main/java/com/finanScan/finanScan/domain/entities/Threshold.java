package com.finanScan.finanScan.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Threshold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double max;

    @OneToOne
    @JoinColumn
    private User user;

    @OneToOne(cascade = CascadeType.MERGE)
    private Category category;
}
