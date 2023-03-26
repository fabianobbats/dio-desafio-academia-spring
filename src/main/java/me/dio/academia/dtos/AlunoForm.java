package me.dio.academia.dtos;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public record AlunoForm(
    @NotEmpty(message = "Este campo é obrigatório!")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres.")
    String nome,

    @NotEmpty(message = "Este campo é obrigatório!")
    @CPF(message = "'${validatedValue}' é inválido!")
    String cpf,

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres.")
    String bairro,

    @NotNull(message = "Prencha o campo corretamente.")
    @Past(message = "Data '${validatedValue}' é inválida.")
    LocalDate dataDeNascimento) {
}
