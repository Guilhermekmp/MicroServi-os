package com.example.microservicos.forma_pagamento;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class FormaPagamentoController {

  private FormaPagamentoService service;

  @GetMapping
  public ResponseEntity<Void> escolheFormaPagamento(){
     service.escolheFormaPagamento();
     return ResponseEntity.ok().build();
  }
  @GetMapping("/remover")
  public ResponseEntity<Void> removerFormaPagamento(){
    service.removerFormaPagamento();
    return ResponseEntity.ok().build();
  }
  @GetMapping("/retornar")
  public ResponseEntity<Void> retornaFormaPagamento(){
    service.retornaFormaPagamento();
    return ResponseEntity.ok().build();
  }
  @GetMapping("/enviar-valor")
  public ResponseEntity<Void> enviaValorPedido(){
    service.enviaValorPedido();
    return ResponseEntity.ok().build();
  }
  @GetMapping("/calcula")
  public ResponseEntity<Void> caculaPedido(){
    service.caculaPedido();
    return ResponseEntity.ok().build();
  }

  @PostMapping
  public ResponseEntity<Void> insereFormaPagamento(){
    service.insereFormaPagamento();
    return ResponseEntity.ok().build();
  }
}
