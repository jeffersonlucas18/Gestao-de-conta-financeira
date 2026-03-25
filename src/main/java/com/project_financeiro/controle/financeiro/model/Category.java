package com.project_financeiro.controle.financeiro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;
}
