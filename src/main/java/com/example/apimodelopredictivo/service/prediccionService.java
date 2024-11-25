package com.example.apimodelopredictivo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apimodelopredictivo.entity.prediccion;
import com.example.apimodelopredictivo.repository.prediccionRepository;

@Service
public class prediccionService {
    @Autowired
    private prediccionRepository prediccionRepository;

    public List<prediccion> getPrediccionesByUserId(int idprediccion) {
        return prediccionRepository.findByIdprediccion(idprediccion);
    }

    public prediccion createPrediccion(prediccion prediccion) {
        return prediccionRepository.save(prediccion);
    }

    public List<prediccion> getPredicciones() {
        return prediccionRepository.findAll();
    }

}
