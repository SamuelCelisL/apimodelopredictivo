package com.example.apimodelopredictivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apimodelopredictivo.entity.prediccion;
import com.example.apimodelopredictivo.service.prediccionService;
import com.example.apimodelopredictivo.service.resultadosService;

@RestController
@RequestMapping(path = "api/v1/prediccion")
public class prediccionController {

    @Autowired
    private prediccionService prediccionService;

    private resultadosService resultadosService;

    public prediccionController(prediccionService prediccionService, resultadosService resultadosService) {
        this.prediccionService = prediccionService;
        this.resultadosService = resultadosService;
    }

    @GetMapping("/")
    public List<prediccion> getPredicciones() {
        return prediccionService.getPredicciones();
    }

    @GetMapping("/{iduser}")
    public List<prediccion> getPrediccionesById(@PathVariable int iduser) {
        return prediccionService.getPrediccionesByUserId(iduser);
    }

    @PostMapping
    public prediccion createPrediccion(@RequestBody prediccion prediccion) {
        return prediccionService.createPrediccion(prediccion);
    }

    @DeleteMapping("/{idprediccion}")
    public void deleteprediccion(@PathVariable int idprediccion) {
        resultadosService.eliminarPrediccionesPorIdprediccion(idprediccion);
        prediccionService.delete(idprediccion);
    }

}