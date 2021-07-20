package com.example.microservicos.carrinho_compra;

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
@RequestMapping("/carrinho-compra")
@AllArgsConstructor
public class CarrinhoCompraController {

  private CarrinhoCompraService service;

  @GetMapping("/{idCarrinho}")
  public ResponseEntity<Void> listaProdutos(@PathVariable Integer idCarrinho){
     service.listaProdutos(idCarrinho);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/{idProduto}")
  public ResponseEntity<Void> alteraQuantidade(@PathVariable Integer idProduto){
    service.alteraQuantidade(idProduto);
    return ResponseEntity.ok().build();
  }

  @PostMapping
  public ResponseEntity<Void> transformaListaEmCarrinho(@RequestBody Integer idCarrinho){
    service.transformaListaEmCarrinho(idCarrinho);
    return ResponseEntity.ok().build();
  }
}
