package com.desafio.pitang.desafio_pitang.service;

import com.desafio.pitang.desafio_pitang.exception.BusinessException;
import com.desafio.pitang.desafio_pitang.mapper.ConverterDTO;
import com.desafio.pitang.desafio_pitang.model.dto.CarroDTO;
import com.desafio.pitang.desafio_pitang.model.entity.Carro;
import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.repository.CarroRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarroServiceTest {

    @InjectMocks
    CarroService carroService;

    @Mock
    ConverterDTO converter;

    @Mock
    CarroRepository carroRepository;

    List<Carro> carros;

    List<CarroDTO> carrosDTO;

    Usuario usuario;

    @Before
    public void setup() {

        MockitoAnnotations.openMocks(this);

        usuario = new Usuario();
        usuario.setId(1L);
        usuario.setCars(carros);
        usuario.setEmail("test@gmail.com");
        usuario.setLogin("login");

        Carro carro1 = new Carro(1L,1,"1","1","1", usuario);
        Carro carro2 = new Carro(2L,2,"2","2","2", usuario);

        CarroDTO carro1DTO = new CarroDTO(1L,1,"1","1","1");
        CarroDTO carro2DTO = new CarroDTO(2L,2,"2","2","2");

        carros = List.of(carro1, carro2);
        carrosDTO = List.of(carro1DTO, carro2DTO);
    }

    @Test
    public void cadastrarCarrosTest() {
        // Mocando consulta e converção de objeto
        when(this.carroRepository.save(any())).thenReturn(carros.get(0));
        when(converter.convertObject(carrosDTO.get(0), Carro.class)).thenReturn(carros.get(0));
        when(converter.convertObject(carros.get(0), CarroDTO.class)).thenReturn(carrosDTO.get(0));
        when(this.carroRepository.existsByLicensePlate(any())).thenReturn(false);

        // Executando
        CarroDTO result = carroService.cadastrarCarros(carrosDTO.get(0), usuario);
        assertEquals(carrosDTO.get(0), result);

    }

    @Test
    public void cadastrarCarrosPlacaJaExisteTest() {
        // Mocando consulta e converção de objeto
        when(this.carroRepository.save(any())).thenReturn(carros.get(0));
        when(converter.convertObject(carrosDTO.get(0), Carro.class)).thenReturn(carros.get(0));
        when(converter.convertObject(carros.get(0), CarroDTO.class)).thenReturn(carrosDTO.get(0));
        when(this.carroRepository.existsByLicensePlate(anyString())).thenReturn(true);

        // Executando
        Exception exception = assertThrows(BusinessException.class, () -> carroService.cadastrarCarros(carrosDTO.get(0), usuario));

        // Verificando resultado
        String expectedMessage = "License plate already exists";
        String resultMessage = exception.getMessage();
        assertEquals(expectedMessage, resultMessage);

    }

}
