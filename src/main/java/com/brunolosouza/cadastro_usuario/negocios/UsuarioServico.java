package com.brunolosouza.cadastro_usuario.negocios;

import com.brunolosouza.cadastro_usuario.infraestrutura.entidades.Usuario;
import com.brunolosouza.cadastro_usuario.infraestrutura.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {

    private final UsuarioRepositorio repositorio ;

    public UsuarioServico(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void salvarUsuario(Usuario usuario) {
        repositorio.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {

        return repositorio.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUsuarioPorEmail(String email) {
        repositorio.deleteByEmail(email);
    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repositorio.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario não encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ?
                        usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ?
                        usuario.getNome() : usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .telefone(usuario.getTelefone() != null ?
                        usuario.getTelefone() : usuarioEntity.getTelefone())
                .build();

        repositorio.saveAndFlush(usuarioAtualizado);
    }

}
