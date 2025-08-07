package com.brunolosouza.cadastro_usuario.infraestrutura.repositorio;

import com.brunolosouza.cadastro_usuario.infraestrutura.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
