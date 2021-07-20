package com.example.microservicos.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
  @Autowired
  private PedidoRepository repository;

  public void calculaTotalCaminho(){
  }

  public void adicionarProduto(Integer idProduto, Integer quantidade){
  }

  public  void retiraProduto(Integer idProduto){
  }

  public void orcamentoParaPedido(Integer idPedido){
  }

  public void enviaValorProdutos(Integer idPedido){
  }

  public void concluiPedido(Integer idPedido){
  }

  public void pagtoStatus(Integer idPedido){
  }

}
