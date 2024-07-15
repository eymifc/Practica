package com.proy1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "personal")
public class PersonalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codper;
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "ap")
    private String ap;
    @Column (name = "am")
    private String am;
    @Column (name="estado")
    private int estado;
}
