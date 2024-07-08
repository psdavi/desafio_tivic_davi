package com.davi.api_got.domain.ocorrencia;


public record OcorrenciaResponseDTO(String id, String nome, String descricao) {
    public OcorrenciaResponseDTO(Ocorrencia ocorrencia){
        this(ocorrencia.getId(), ocorrencia.getNome(), ocorrencia.getDescricao());
    }
}
