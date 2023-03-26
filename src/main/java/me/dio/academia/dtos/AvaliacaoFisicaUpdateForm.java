package me.dio.academia.dtos;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Positive;

public record AvaliacaoFisicaUpdateForm(
    @Positive(message = "${validatedValue}' precisa ser positivo.")    
    double pesoAtual,

    @Positive(message = "${validatedValue}' precisa ser positivo.")
    @DecimalMin(value = "2.30", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    @DecimalMax(value = "1.20", message = "'${validatedValue}' precisa ser no máximo {value}.")
    double alturaAtual) {
}
