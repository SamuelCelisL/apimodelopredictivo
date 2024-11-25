package com.example.apimodelopredictivo.service;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;
import com.example.apimodelopredictivo.types.calificaciones;
import java.util.List;
import com.example.apimodelopredictivo.entity.resultados;

public class calificacionesService {

    private final RestTemplate restTemplate;

    public calificacionesService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<resultados> enviarDatosAFlask(calificaciones calificaciones, int idprediccion) {
        String idtext = Integer.toString(idprediccion);
        String urlFlask = "https://mpa-model.onrender.com/evaluar/" + idtext;

        try {
            // Crear la entidad HTTP con los datos de calificaciones
            HttpEntity<calificaciones> requestEntity = new HttpEntity<>(calificaciones);

            // Enviar datos a Flask usando RestTemplate y el método exchange
            ResponseEntity<List<resultados>> respuesta = restTemplate.exchange(
                    urlFlask,
                    HttpMethod.POST,
                    requestEntity,
                    new ParameterizedTypeReference<List<resultados>>() {
                    });
            return respuesta.getBody();
        } catch (Exception e) {
            throw new RuntimeException("Error al comunicarse con la API Flask: " + e.getMessage());
        }
    }
}
