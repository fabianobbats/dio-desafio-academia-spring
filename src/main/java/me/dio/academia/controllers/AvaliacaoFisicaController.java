package me.dio.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import me.dio.academia.dtos.AvaliacaoFisicaForm;
import me.dio.academia.models.AvaliacaoFisica;
import me.dio.academia.services.AvaliacaoFisicaService;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
  @Autowired
  private AvaliacaoFisicaService service;

  @PostMapping
  public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll() {
    return service.getAll();
  }
}
