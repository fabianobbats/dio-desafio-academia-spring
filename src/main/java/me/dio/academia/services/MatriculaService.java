package me.dio.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.dtos.MatriculaForm;
import me.dio.academia.models.Aluno;
import me.dio.academia.models.Matricula;
import me.dio.academia.repositories.AlunoRepository;
import me.dio.academia.repositories.MatriculaRepository;

@Service
public class MatriculaService {
  @Autowired
  private MatriculaRepository matriculaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  public Matricula create(MatriculaForm form) {
    Matricula matricula = new Matricula();
    Aluno aluno = alunoRepository.findById(form.alunoId()).get();

    matricula.setAluno(aluno);

    return matriculaRepository.save(matricula);
  }

  public Matricula get(Long id) {
    return matriculaRepository.findById(id).get();
  }

  public List<Matricula> getAll(String bairro) {

    if (bairro == null) {
      return matriculaRepository.findAll();
    } else {
      return matriculaRepository.findByAlunoBairro(bairro);
    }

  }

  public void delete(Long id) {
  }

}
