package com.example.apimodelopredictivo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apimodelopredictivo.entity.resultados;
import com.example.apimodelopredictivo.repository.resultadosRepository;

@Service
public class resultadosService {

    @Autowired
    private resultadosRepository resultadosRepository;

    public List<resultados> getresultadosById(int idprediccion) {
        return resultadosRepository.findAllById(Collections.singletonList(idprediccion));
    }
}
