package com.example.apimodelopredictivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apimodelopredictivo.entity.prediccion;
import com.example.apimodelopredictivo.service.prediccionService;

@RestController
@RequestMapping(path = "api/v1/prediccion")
public class prediccionController {

    @Autowired
    private prediccionService prediccionService;

    public prediccionController(prediccionService prediccionService) {
        this.prediccionService = prediccionService;
    }

    @GetMapping("/")
    public List<prediccion> getPredicciones() {
        return prediccionService.getPredicciones();
    }

    @GetMapping("/{idprediccion}")
    public List<prediccion> getPrediccionesById(@PathVariable int idprediccion) {
        return prediccionService.getPrediccionesByUserId(idprediccion);
    }

    @PostMapping
    public prediccion createPrediccion(@RequestBody prediccion prediccion) {
        return prediccionService.createPrediccion(prediccion);
    }

}