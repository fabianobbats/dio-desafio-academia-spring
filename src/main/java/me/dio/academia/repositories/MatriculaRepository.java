package me.dio.academia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.models.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

  List<Matricula> findByAlunoBairro(String bairro);

}
