package com.example.microservicos.carrinho_compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoCompraService {
  @Autowired
  private CarrinhoCompraRepository repository;

  public void alteraQuantidade(Integer idProduto){
  }

  public void transformaListaEmCarrinho(Integer idCarrinho){
  }
  public void listaProdutos(Integer idCarrinho){
  }
}
