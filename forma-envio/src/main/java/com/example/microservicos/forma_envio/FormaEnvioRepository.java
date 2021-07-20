package com.example.microservicos.forma_envio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaEnvioRepository extends JpaRepository<FormaEnvio,Integer> {
}
