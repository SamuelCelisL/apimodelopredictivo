package com.example.apimodelopredictivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apimodelopredictivo.entity.resultados;

@Repository

public interface resultadosRepository extends JpaRepository<resultados, Integer> {

}
