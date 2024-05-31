package com.desafio.pitang.desafio_pitang.controller;

import com.desafio.pitang.desafio_pitang.model.dto.CarroDTO;
import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.service.CarroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CarroDTO> listarCarros(@AuthenticationPrincipal Usuario usuario) {
        return carroService.listarCarros(usuario);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public CarroDTO editarCarro(@PathVariable Long id,
                                @RequestBody  CarroDTO carroDTO,
                                @AuthenticationPrincipal Usuario usuario) {
        return carroService.editarCarros(carroDTO, id, usuario);
    }

}
