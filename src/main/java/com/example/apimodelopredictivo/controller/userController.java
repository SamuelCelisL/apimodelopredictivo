package com.example.apimodelopredictivo.controller;

import java.util.Optional;
import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apimodelopredictivo.entity.profesor;
import com.example.apimodelopredictivo.service.profesorService;

@RestController
@RequestMapping(path = "api/v1/profesor")
public class userController {

    @Autowired
    private profesorService profesorservice;

    public userController(profesorService profesorservice) {
        this.profesorservice = profesorservice;
    }

    @GetMapping("/")
    public List<profesor> getAll() {
        System.out.println(profesorservice.getUsuarios());
        return profesorservice.getUsuarios();
    }

    @GetMapping("/{iduser}")
    public Optional<profesor> getById(@PathVariable int iduser) {
        return profesorservice.getUsuario(iduser);
    }

    @PostMapping
    public void saveUpdate(@RequestBody profesor usuario) {
        profesorservice.saveOpUpdate(usuario);
    }

    @DeleteMapping("/{iduser}")
    public String saveUpdate(@PathVariable int iduser) {
        try {
            profesorservice.delete(iduser);
            return "Eliminacion de usuario correcta";
        } catch (Exception e) {
            // TODO: handle exception
            return "" + e;
        }
    }
}
