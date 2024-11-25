package com.example.apimodelopredictivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.example.apimodelopredictivo.entity.resultados;

import com.example.apimodelopredictivo.types.calificaciones;
import com.example.apimodelopredictivo.service.calificacionesService;
import com.example.apimodelopredictivo.service.resultadosService;

@RestController
@RequestMapping(path = "api/v1/calificaciones")
public class calificacionesController {

    @Autowired
    private calificacionesService calificacionesService;
    private resultadosService resultadosService;

    public calificacionesController(calificacionesService calificacionesService) {
        this.calificacionesService = calificacionesService;
    }

    @PostMapping("/{idprediccion}")
    public ResponseEntity<?> enviarDatos(@PathVariable int idprediccion, @RequestBody calificaciones calificaciones) {
        // Llamar al servicio y procesar la respuesta
        List<resultados> respuesta = calificacionesService.enviarDatosAFlask(calificaciones, idprediccion);
        resultadosService.guardar(respuesta);
        return ResponseEntity.ok(respuesta);
    }

}
