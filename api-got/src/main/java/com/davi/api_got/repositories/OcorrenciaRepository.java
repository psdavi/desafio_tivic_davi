package com.davi.api_got.repositories;


import com.davi.api_got.domain.ocorrencia.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, String> {
}
