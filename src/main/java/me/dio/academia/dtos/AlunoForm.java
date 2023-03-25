package me.dio.academia.dtos;

import java.time.LocalDate;

public record AlunoForm(
    String nome,
    String cpf,
    String bairro,
    LocalDate dataDeNascimento) {
}
