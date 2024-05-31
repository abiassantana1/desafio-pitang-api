package com.desafio.pitang.desafio_pitang.controller;

import com.desafio.pitang.desafio_pitang.model.dto.UsuarioBasicoDTO;
import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.service.UsuarioService;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioDTO;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
    public List<UsuarioBasicoDTO> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO editarUsuario(@PathVariable Long id,
                                    @Valid @RequestBody UsuarioDTO usuarioDTO,
                                    @AuthenticationPrincipal Usuario usuario) {
        return usuarioService.editarUsuarios(usuarioDTO, id, usuario);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerUsuario(@PathVariable Long id, @AuthenticationPrincipal Usuario usuario) {
        usuarioService.removerUsuario(id, usuario);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioDTO buscarUsuario(@PathVariable Long id, @AuthenticationPrincipal Usuario usuario) {
        return usuarioService.buscarUsuario(id, usuario);
    }
}
