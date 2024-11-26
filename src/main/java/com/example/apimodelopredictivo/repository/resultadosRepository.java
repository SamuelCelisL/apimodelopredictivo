package com.example.apimodelopredictivo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apimodelopredictivo.entity.resultados;

@Repository

public interface resultadosRepository extends JpaRepository<resultados, Integer> {
    void deleteByIdprediccion(int idprediccion);

    List<resultados> findAllByIdprediccion(int idprediccion);
}
