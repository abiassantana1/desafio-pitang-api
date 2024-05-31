package com.desafio.pitang.desafio_pitang.controller;


import com.desafio.pitang.desafio_pitang.exception.InvalidCredentialException;
import com.desafio.pitang.desafio_pitang.mapper.ConverterDTO;
import com.desafio.pitang.desafio_pitang.model.dto.AuthenticationDTO;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioDTO;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioLoginDTO;
import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.service.TokenService;
import com.desafio.pitang.desafio_pitang.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;

    private final TokenService tokenService;

    private final UsuarioService usuarioService;

    private ConverterDTO converter;

    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        if(auth.isAuthenticated()){

            usuarioService.atualizarUltimoLogin((Usuario) auth.getPrincipal());
            var token = tokenService.generateToken((Usuario) auth.getPrincipal());
            return ResponseEntity.ok(new UsuarioLoginDTO(token,
                    (UsuarioDTO) converter.convertObject((Usuario) auth.getPrincipal(), UsuarioDTO.class)));
        }
        throw new InvalidCredentialException("Unauthorized");
    }
}
