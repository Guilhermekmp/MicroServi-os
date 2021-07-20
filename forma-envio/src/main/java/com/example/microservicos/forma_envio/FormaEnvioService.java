package com.example.microservicos.forma_envio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaEnvioService {
  @Autowired
  private FormaEnvioRepository repository;

  public void pesoProduto(Integer idPedido){
  }

  public void calculaFrete(Integer idPedido){
  }

  public void formaEnvio(){
  }

  public void valorPostagem(Integer idPedido){
  }

  public void selecionarFormaEnvio(Integer idPedido, Integer formaEnvio){
  }

  public void envioStatus(Integer idPedido){
  }
}
