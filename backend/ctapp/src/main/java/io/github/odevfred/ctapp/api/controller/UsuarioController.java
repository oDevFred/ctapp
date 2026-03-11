package io.github.odevfred.ctapp.api.controller;

import io.github.odevfred.ctapp.application.service.UsuarioService;
import io.github.odevfred.ctapp.api.dto.UsuarioRequestDTO;
import io.github.odevfred.ctapp.domain.model.Usuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody @Valid UsuarioRequestDTO dto) {
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(dto.nome());
        novoUsuario.setEmail(dto.email());
        novoUsuario.setSenhaHash(dto.senha());
        novoUsuario.setRole(dto.role());

        Usuario usuarioSalvo = usuarioService.criarUsuario(novoUsuario);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
    }
}