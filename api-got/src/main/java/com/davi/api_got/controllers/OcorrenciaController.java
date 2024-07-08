package com.davi.api_got.controllers;

import com.davi.api_got.domain.ocorrencia.Ocorrencia;
import com.davi.api_got.domain.ocorrencia.OcorrenciaRequestDTO;
import com.davi.api_got.domain.ocorrencia.OcorrenciaResponseDTO;
import com.davi.api_got.repositories.OcorrenciaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaRepository repository;

    @PostMapping
    public ResponseEntity postOcorrencia(@RequestBody @Valid OcorrenciaRequestDTO body){
        Ocorrencia newOcorrencia = new Ocorrencia(body);

        this.repository.save(newOcorrencia);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllOcorrencias(){
        List<OcorrenciaResponseDTO> productList = this.repository.findAll().stream().map(OcorrenciaResponseDTO::new).toList();

        return ResponseEntity.ok(productList);
    }
}
