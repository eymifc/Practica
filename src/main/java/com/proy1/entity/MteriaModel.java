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
@Table(name= "materias")
public class MteriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "nombre")
    private String nombre;
    @Column(name= "sigla")
    private String sigla;
    @Column(name = "estado")
    private int estado;
}
