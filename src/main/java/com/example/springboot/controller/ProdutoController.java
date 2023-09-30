package com.example.springboot.controller;
import com.example.springboot.model.Produto;
import com.example.springboot.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @GetMapping(path = "/get")
    public Iterable<Produto> getProdutos(){
        return produtoRepository.findAll();
    }

    @PostMapping(path = "/create/{nome}")
    public void save(@PathVariable("nome") String nome){
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable("id") int id){
        produtoRepository.deleteById(id);
    }
}
