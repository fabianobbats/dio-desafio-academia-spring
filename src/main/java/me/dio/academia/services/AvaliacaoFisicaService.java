package me.dio.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.dtos.AvaliacaoFisicaForm;
import me.dio.academia.dtos.AvaliacaoFisicaUpdateForm;
import me.dio.academia.models.Aluno;
import me.dio.academia.models.AvaliacaoFisica;
import me.dio.academia.repositories.AlunoRepository;
import me.dio.academia.repositories.AvaliacaoFisicaRepository;

@Service
public class AvaliacaoFisicaService {
  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.alunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(form.pesoAtual());
    avaliacaoFisica.setAltura(form.alturaAtual());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  public AvaliacaoFisica get(Long id) {
    return avaliacaoFisicaRepository.findById(id).get();
  }

  public List<AvaliacaoFisica> getAll() {
    return avaliacaoFisicaRepository.findAll();
  }

  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm form) {
    AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaRepository.findById(id).get();

    avaliacaoFisica.setPeso(form.pesoAtual());
    avaliacaoFisica.setAltura(form.alturaAtual());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  public void delete(Long id) {
    avaliacaoFisicaRepository.deleteById(id);
  }
}
