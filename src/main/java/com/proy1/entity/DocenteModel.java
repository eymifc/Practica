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
@Table(name= "docente")
public class DocenteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "nombre")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "materia_id")
    private MteriaModel materia;;
    @Column(name = "grupo")
    private int grupo;
    @Column(name= "aula")
    private String aula;
    @Column(name = "estado")
    private int estado;
}
