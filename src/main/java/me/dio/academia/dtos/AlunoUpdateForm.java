package me.dio.academia.dtos;

import java.time.LocalDate;

public record AlunoUpdateForm(
    String nome,
    String bairro,
    LocalDate dataDeNascimento) {
}
