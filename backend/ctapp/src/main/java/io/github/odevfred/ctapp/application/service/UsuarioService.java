package io.github.odevfred.ctapp.application.service;

import io.github.odevfred.ctapp.domain.model.Usuario;
import io.github.odevfred.ctapp.domain.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario criarUsuario(Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado no sistema");
        }

        return usuarioRepository.save(usuario);
    }
}
