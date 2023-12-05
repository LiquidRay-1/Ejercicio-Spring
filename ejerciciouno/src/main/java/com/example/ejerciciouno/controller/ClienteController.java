package com.example.ejerciciouno.controller;

import com.example.ejerciciouno.model.Cliente;
import com.example.ejerciciouno.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteService clienteService;
    @GetMapping("/clientes")
    public List<Cliente> clienteList(){
        return clienteService.listaCliente();
    }

    @PostMapping("/cliente/save")
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @GetMapping("/cliente/{id}")
    public Cliente clienteId(@PathVariable Long id){
        return clienteService.buscarCliente(id);
    }

    @GetMapping("/cliente/user/{username}")
    public List<Cliente> buscarUsername(@PathVariable String username){
        return clienteService.buscarUsername(username);
    }

    @GetMapping("/cliente/email/{email}")
    public List<Cliente> buscarEmail(@PathVariable String email){
        return clienteService.buscarEmail(email);
    }

    @GetMapping("/cliente/provincia/{provincia}")
    public List<Cliente> buscarProvincia(@PathVariable String provincia){
        return clienteService.buscarProvincia(provincia);
    }

    @GetMapping("/cliente/comunidad/{comunidad}")
    public List<Cliente> buscarComunidad(@PathVariable String comunidad_autonoma){
        return clienteService.buscarComunidad(comunidad_autonoma);
    }
}
