package me.dio.academia.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.models.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

  List<Aluno> findByDataDeNascimento(LocalDate localDate);

}