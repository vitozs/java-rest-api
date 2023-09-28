package com.example.springboot.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data //substitui getters/setters/hashCode/equals
@Entity //Entidade que 'e mapeada no banco
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Delegamos a resp. de incrementar o id no banco
    private Long id;
    private String nome;

}
