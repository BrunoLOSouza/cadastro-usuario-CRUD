package com.brunolosouza.cadastro_usuario.controlador;

import com.brunolosouza.cadastro_usuario.infraestrutura.entidades.Usuario;
import com.brunolosouza.cadastro_usuario.negocios.UsuarioServiço;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioControlador {

    private final UsuarioServiço usuarioServiço;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioServiço.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email) {

        return ResponseEntity.ok(usuarioServiço.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email) {
        usuarioServiço.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id,
                                                      @RequestBody Usuario usuario) {
        usuarioServiço.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }


}
