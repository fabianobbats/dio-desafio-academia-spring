package me.dio.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.dtos.MatriculaForm;
import me.dio.academia.models.Matricula;
import me.dio.academia.services.MatriculaService;

@RestController
@RequestMapping("/matriculas")
public class MatriculaControlller {

  @Autowired
  private MatriculaService service;

  @PostMapping
  public Matricula create(@RequestBody MatriculaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }
}
