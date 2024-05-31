package com.desafio.pitang.desafio_pitang.controller;

import com.desafio.pitang.desafio_pitang.model.dto.CarroDTO;
import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.service.CarroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarroController {
    
    private final CarroService carroService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarroDTO cadastrarCarro(@RequestBody  CarroDTO carroDTO, @AuthenticationPrincipal Usuario usuario) {
        return carroService.cadastrarCarros(carroDTO, usuario);
    }

}
