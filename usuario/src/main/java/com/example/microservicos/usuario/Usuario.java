package com.example.microservicos.usuario;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idUsuario;

  private String nomeUsuario;
  private String senhaUsuario;
  private String emailUsuario;
  private String enderecoUsuario;
  private String cpfUsuario;

}
