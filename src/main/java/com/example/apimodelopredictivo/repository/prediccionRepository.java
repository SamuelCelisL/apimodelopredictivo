package com.example.apimodelopredictivo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apimodelopredictivo.entity.prediccion;

@Repository

public interface prediccionRepository extends JpaRepository<prediccion, Integer> {
    List<prediccion> findByIdprediccion(Integer idprediccion);
}