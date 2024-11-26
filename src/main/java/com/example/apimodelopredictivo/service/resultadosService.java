package com.example.apimodelopredictivo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apimodelopredictivo.entity.resultados;
import com.example.apimodelopredictivo.repository.resultadosRepository;

import jakarta.transaction.Transactional;

@Service
public class resultadosService {

    @Autowired
    private resultadosRepository resultadosRepository;

    public List<resultados> getresultadosByIdprediccion(int idprediccion) {
        return resultadosRepository.findAllByIdprediccion(idprediccion);
    }

    public String guardar(List<resultados> respuesta) {
        try {
            resultadosRepository.saveAll(respuesta);
            return "Guardado";
        } catch (Exception e) {
            return "Error";
        }
    }

    public List<resultados> guardarPredicciones(List<resultados> predicciones) {
        return resultadosRepository.saveAll(predicciones);
    }

    @Transactional
    public void eliminarPrediccionesPorIdprediccion(int idprediccion) {
        resultadosRepository.deleteByIdprediccion(idprediccion);
    }
}
