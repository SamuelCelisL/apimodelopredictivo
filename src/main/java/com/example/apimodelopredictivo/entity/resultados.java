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
@Table(name = "resultados")
public class resultados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idresultados")
    private int idresultados;

    @Column(name = "idprediccion", nullable = false)
    private int idprediccion;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "resultado", nullable = false)
    private String resultado;

}