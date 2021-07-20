package com.example.microservicos.carrinho_compra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoCompraRepository extends JpaRepository<CarrinhoCompra,Integer> {
}
