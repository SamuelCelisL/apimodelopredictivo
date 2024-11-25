package com.example.apimodelopredictivo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class calificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestudiante")
    private int idestudiante;

    @Column(name = "nombree", nullable = false)
    private int nombree;

    @Column(name = "nota15c1", nullable = false)
    private String nota15c1;

    @Column(name = "nota20c1", nullable = false)
    private int nota20c1;

    @Column(name = "nota15c2", nullable = false)
    private String nota15c2;

    @Column(name = "nota20c2", nullable = false)
    private int nota20c2;

    @Column(name = "nota10c3", nullable = false)
    private String nota10c3;

    @Column(name = "nota20c3", nullable = false)
    private int nota20c3;

}
