package com.example.springboot.repository;

import com.example.springboot.model.Produto;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
