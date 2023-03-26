package me.dio.academia.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_avaliacoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "aluno_id", nullable = false)
  @JsonManagedReference
  @JsonIdentityReference(alwaysAsId = true)
  private Aluno aluno;

  @Column(nullable = false)
  private LocalDate dataDaAvaliacao = LocalDate.now();

  @Column(nullable = false)
  private Double peso;

  @Column(nullable = false)
  private Double altura;
}
