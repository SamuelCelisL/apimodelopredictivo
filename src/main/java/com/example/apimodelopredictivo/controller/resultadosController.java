package com.example.apimodelopredictivo.controller;

import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apimodelopredictivo.entity.resultados;
import com.example.apimodelopredictivo.service.resultadosService;

@RestController
@RequestMapping(path = "api/v1/resultados")
public class resultadosController {

    @Autowired
    private resultadosService resultadosService;

    public resultadosController(resultadosService resultadosService) {
        this.resultadosService = resultadosService;
    }

    @GetMapping("/{idprediccion}")
    public List<resultados> getresultadosById(@PathVariable int idprediccion) {
        return resultadosService.getresultadosById(idprediccion);
    }

}
