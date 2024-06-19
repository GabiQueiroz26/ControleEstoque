package com.example.estoque.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(@NotBlank String name, @NotBlank String cpf, @NotBlank String telefone,
                               @NotBlank String celular, @NotBlank String email, @NotBlank String dataNascimento, @NotBlank String CEP, @NotBlank String endereco, @NotNull Integer numero,
                               @NotBlank String bairro, @NotBlank String cidade, @NotBlank String UF, @NotBlank String usuario, @NotBlank String senha) {
}