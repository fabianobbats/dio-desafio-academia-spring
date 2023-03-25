package me.dio.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.academia.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}