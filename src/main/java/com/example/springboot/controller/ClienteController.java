package com.example.springboot.controller;

import com.example.springboot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springboot.model.Cliente;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }


    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente){ //Converte o corpo da requisicao em um objeto Java
        return clienteRepository.save(cliente);
    }

}
