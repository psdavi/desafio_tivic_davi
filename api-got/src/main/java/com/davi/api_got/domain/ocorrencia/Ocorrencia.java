package com.davi.api_got.domain.ocorrencia;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Table(name = "ocorrencia")
@Entity(name = "ocorrencia")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String descricao;

    public Ocorrencia(OcorrenciaRequestDTO data){
        this.descricao = data.descricao();
        this.nome = data.nome();
    }
}
