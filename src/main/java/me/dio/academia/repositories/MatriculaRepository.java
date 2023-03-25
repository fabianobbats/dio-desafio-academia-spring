package me.dio.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.academia.models.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

}
