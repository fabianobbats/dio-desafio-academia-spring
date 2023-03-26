package me.dio.academia.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record MatriculaForm(
    @NotNull(message = "Este campo é obrigatório!")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    Long alunoId) {
}
