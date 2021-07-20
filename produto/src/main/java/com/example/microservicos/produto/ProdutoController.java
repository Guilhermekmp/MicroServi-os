package com.example.microservicos.produto;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class ProdutoController {

  private ProdutoService service;

  @PutMapping
  public ResponseEntity<Void>  alterar(){
     service.alterarProduto();
     return ResponseEntity.ok().build();
  }

  @PostMapping
  public ResponseEntity<Void>  save(@RequestBody Produto produto){
    service.cadastrarProduto();
    return ResponseEntity.ok().build();
  }

  @DeleteMapping
  public ResponseEntity<Void> delete(@RequestBody Produto produto){
    service.removerProduto();
    return ResponseEntity.ok().build();
  }
}
