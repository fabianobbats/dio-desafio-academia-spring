package me.dio.academia.dtos;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record AvaliacaoFisicaForm(
    @NotNull(message = "Este campo é obrigatório!")
    @Positive(message = "${validatedValue}' precisa ser positivo.")                
    Long alunoId,

    @NotNull(message = "Este campo é obrigatório!")
    @Positive(message = "${validatedValue}' precisa ser positivo.")
    Double pesoAtual,

    @NotNull(message = "Este campo é obrigatório!")
    @Positive(message = "${validatedValue}' precisa ser positivo.")
    @DecimalMin(value = "2.30", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    @DecimalMax(value = "1.20", message = "'${validatedValue}' precisa ser no máximo {value}.")
    Double alturaAtual) {
}
