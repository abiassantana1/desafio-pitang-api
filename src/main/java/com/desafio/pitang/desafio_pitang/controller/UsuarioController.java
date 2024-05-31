package com.desafio.pitang.desafio_pitang.controller;

import com.desafio.pitang.desafio_pitang.model.dto.UsuarioBasicoDTO;
import com.desafio.pitang.desafio_pitang.service.UsuarioService;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioDTO;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO cadastrarUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.cadastrarUsuarios(usuarioDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioBasicoDTO> listarUsuarios(SecurityContextHolderAwareRequestWrapper request) {
        return usuarioService.listarUsuarios();
    }
}
