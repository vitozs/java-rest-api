package com.example.springboot.controller;

import com.example.springboot.model.Produto;
import com.example.springboot.repository.ProdutoRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @GetMapping(path = "/get")
    public Iterable<Produto> getProdutos(){
        return produtoRepository.findAll();
    }
}
