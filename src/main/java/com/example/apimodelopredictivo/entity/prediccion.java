package com.example.apimodelopredictivo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prediccion")
public class prediccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprediccion")
    private int idprediccion;

    @Column(name = "iduser", nullable = false)
    private int iduser;

    @Column(name = "nombreprediccion", nullable = false)
    private String nombreprediccion;

    @Column(name = "cortesemestre", nullable = false)
    private int cortesemestre;

    @Column(name = "tipomateria", nullable = false)
    private String tipomateria;

    @Column(name = "horasclase", nullable = false)
    private int horasclase;

}