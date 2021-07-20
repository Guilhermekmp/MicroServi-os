package com.example.microservicos.carrinho_compra;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CarrinhoCompra {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idCarrinho;

  private Integer idProduto;
  private Integer idPedido;
  private Integer quantidade;
  private boolean listaProdutos;


}
