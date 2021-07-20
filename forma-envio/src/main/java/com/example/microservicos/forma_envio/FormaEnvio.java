package com.example.microservicos.forma_envio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class FormaEnvio {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idFormaEnvio;

  private String formaEnvio;

  private Float valorPorQuilo;

}
