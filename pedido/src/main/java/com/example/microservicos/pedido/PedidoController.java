package com.example.microservicos.pedido;

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
public class PedidoController {

  private PedidoService service;

  @GetMapping("/{idPedido}")
  public ResponseEntity<Void> orcamentoParaPedido(@PathVariable Integer idPedido){
    service.orcamentoParaPedido(idPedido);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/remover/{idPedido}")
  public ResponseEntity<Void> removerFormaPagamento(@PathVariable Integer idPedido){
    service.concluiPedido(idPedido);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/retornar/{idPedido}")
  public ResponseEntity<Void> retornaFormaPagamento(@PathVariable Integer idPedido){
    service.retiraProduto(idPedido);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/enviar-valor/{idPedido}")
  public ResponseEntity<Void> enviaValorPedido(@PathVariable Integer idPedido){
    service.enviaValorProdutos(idPedido);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/calcula")
  public ResponseEntity<Void> caculaPedido(){
    service.calculaTotalCaminho();
    return ResponseEntity.ok().build();
  }

  @GetMapping("/pagtoStatus/{idPedido}")
  public ResponseEntity<Void> pagtoStatus(@PathVariable Integer idPedido){
    service.pagtoStatus(idPedido);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/{idPedido}/{quantidade}")
  public ResponseEntity<Void> insereFormaPagamento(@PathVariable Integer idPedido, @PathVariable Integer quantidade){
    service.adicionarProduto(idPedido,quantidade);
    return ResponseEntity.ok().build();
  }
}
