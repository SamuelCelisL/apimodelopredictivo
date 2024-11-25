package com.example.apimodelopredictivo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apimodelopredictivo.entity.profesor;
import com.example.apimodelopredictivo.repository.userRepository;

@Service
public class profesorService {
    @Autowired
    userRepository userRepository;

    public List<profesor> getUsuarios() {
        return userRepository.findAll();
    }

    public Optional<profesor> getUsuario(int iduser) {
        return userRepository.findById(iduser);
    }

    public void saveOpUpdate(profesor user) {
        userRepository.save(user);
    }

    public void delete(int iduser) {
        userRepository.deleteById(iduser);
    }

}
