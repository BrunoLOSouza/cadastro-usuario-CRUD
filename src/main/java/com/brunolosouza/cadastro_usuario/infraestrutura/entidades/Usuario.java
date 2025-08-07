package com.brunolosouza.cadastro_usuario.infraestrutura.entidades;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "Usuario")
@Entity

public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private Integer id;

    @Column (name = "email", unique = true)
    private String email;

    @Column (name = "nome")
    private String nome;

    @Column (name = "telefone")
    private Long telefone;



}
