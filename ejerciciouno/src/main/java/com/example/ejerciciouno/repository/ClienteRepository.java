package com.example.ejerciciouno.repository;

import com.example.ejerciciouno.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByUsername(String username);
    List<Cliente> findByEmail(String email);
    List<Cliente> findByProvincia(String provincia);
    List<Cliente> findByComunidad(String comunidad_autonoma);
}
