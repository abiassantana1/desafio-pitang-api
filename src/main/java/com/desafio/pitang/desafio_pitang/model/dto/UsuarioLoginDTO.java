package com.desafio.pitang.desafio_pitang.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioLoginDTO {

    private String token;
    private UsuarioDTO usuarioDTO;
}
