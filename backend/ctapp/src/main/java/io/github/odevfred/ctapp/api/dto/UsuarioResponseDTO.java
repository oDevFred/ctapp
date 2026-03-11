package io.github.odevfred.ctapp.api.dto;

import io.github.odevfred.ctapp.domain.model.UserRole;
import java.util.UUID;

public record UsuarioResponseDTO(
    UUID id,
    String nome,
    String email,
    UserRole role
) {}