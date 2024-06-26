package br.com.felipesoarestech.api.cliente.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDTO(
        @NotBlank
        String name,

        @NotNull
        Double price
) {
}
