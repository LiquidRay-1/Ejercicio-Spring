package com.example.ejerciciouno.services;

import com.example.ejerciciouno.model.Cliente;
import com.example.ejerciciouno.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }

    public Cliente buscarCliente(Long id){
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> buscarUsername(String username){
        return clienteRepository.findByUsername(username);
    }

    public List<Cliente> buscarEmail(String email){
        return clienteRepository.findByEmail(email);
    }

    public List<Cliente> buscarProvincia(String provincia){
        return clienteRepository.findByProvincia(provincia);
    }

    public List<Cliente> buscarComunidad(String comunidad_autonoma){
        return clienteRepository.findByComunidad(comunidad_autonoma);
    }
}
