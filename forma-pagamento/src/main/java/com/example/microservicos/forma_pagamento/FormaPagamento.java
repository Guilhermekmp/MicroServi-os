package com.example.microservicos.forma_pagamento;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Data
public class FormaPagamento {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idFormaPgto;

  private String formaPgto;

  private String descricao;

}
