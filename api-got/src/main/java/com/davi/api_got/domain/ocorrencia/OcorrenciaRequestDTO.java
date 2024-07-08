package com.davi.api_got.domain.ocorrencia;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigInteger;

public record OcorrenciaRequestDTO(
        @NotBlank
        String nome,

        @NotNull
        String descricao
) {
}
