package com.example.apimodelopredictivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apimodelopredictivo.entity.profesor;

@Repository

public interface userRepository extends JpaRepository<profesor, Integer> {
    profesor findByUserAndPassword(String user, String password);
}
