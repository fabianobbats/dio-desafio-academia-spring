package me.dio.academia.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.dtos.AlunoForm;
import me.dio.academia.dtos.AlunoUpdateForm;
import me.dio.academia.models.Aluno;
import me.dio.academia.models.AvaliacaoFisica;
import me.dio.academia.repositories.AlunoRepository;
import me.dio.academia.utils.JavaTimeUtils;

@Service
public class AlunoService {
  @Autowired
  private AlunoRepository repository;

  public Aluno create(AlunoForm form) {
    Aluno aluno = new Aluno();
    aluno.setNome(form.nome());
    aluno.setCpf(form.cpf());
    aluno.setBairro(form.bairro());
    aluno.setDataDeNascimento(form.dataDeNascimento());

    return repository.save(aluno);
  }

  public Aluno get(Long id) {
    return repository.findById(id).get();
  }

  public List<Aluno> getAll(String dataDeNascimento) {

    if (dataDeNascimento == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDataDeNascimento(localDate);
    }

  }

  public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    Aluno aluno = repository.findById(id).get();

    aluno.setNome(formUpdate.nome());
    aluno.setBairro(formUpdate.bairro());
    aluno.setDataDeNascimento(formUpdate.dataDeNascimento());

    return repository.save(aluno);
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }

  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoesFisicas();

  }
}
