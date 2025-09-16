package com.brunolosouza.cadastro_usuario.controlador;

import com.brunolosouza.cadastro_usuario.infraestrutura.entidades.Usuario;
import com.brunolosouza.cadastro_usuario.negocios.UsuarioServico;
import com.brunolosouza.cadastro_usuario.negocios.UsuarioServico;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioControlador {

    private final UsuarioServico usuarioServico;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioServico.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email) {

        return ResponseEntity.ok(usuarioServico.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email) {
        usuarioServico.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id,
                                                      @RequestBody Usuario usuario) {
        usuarioServico.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }


}
