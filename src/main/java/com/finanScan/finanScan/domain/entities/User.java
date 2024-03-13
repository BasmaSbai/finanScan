package com.finanScan.finanScan.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    @OneToOne(cascade = CascadeType.MERGE)
    private Profil profil;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Setting> setting;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Threshold> thresholds;
}
