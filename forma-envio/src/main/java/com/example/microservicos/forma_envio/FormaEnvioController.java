package com.example.microservicos.forma_envio;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class FormaEnvioController {

  private FormaEnvioService service;

  @GetMapping
  public ResponseEntity<Void> formaEnvio(){
     service.formaEnvio();
    return ResponseEntity.ok().build();
  }

  @GetMapping("/{idPedido}")
  public ResponseEntity<Void> calculaFrete(@PathVariable Integer idPedido){
    service.calculaFrete(idPedido);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/status/{idPedido}")
  public ResponseEntity<Void> envioStatus(@PathVariable Integer idPedido){
    service.envioStatus(idPedido);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/peso/{idPedido}")
  public ResponseEntity<Void> peso(@PathVariable Integer idPedido){
    service.pesoProduto(idPedido);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/postagem/{idPedido}")
  public ResponseEntity<Void> valorPostagem(@PathVariable Integer idPedido){
    service.valorPostagem(idPedido);
    return ResponseEntity.ok().build();
  }

  @PostMapping
  public ResponseEntity<Void> selecionarFormaEnvio(@RequestBody Integer idPedido, @RequestBody Integer formaEnvio){
    service.selecionarFormaEnvio(idPedido,formaEnvio);
    return ResponseEntity.ok().build();
  }
}
