package com.desafio.pitang.desafio_pitang.service;

import com.desafio.pitang.desafio_pitang.exception.BusinessException;
import com.desafio.pitang.desafio_pitang.exception.SourceNotFoundException;
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
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.anyLong;
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

    @Test
    public void listarCarroCarrosTest() {
        // Mocando consulta e converção de objeto
        when(converter.converterListObjects(any(), any())).thenReturn((carrosDTO));
        when(carroRepository.findAll()).thenReturn(carros);

        // Executando
        List<CarroDTO> result = carroService.listarCarros(usuario);

        // Verificando resultado
        assertAll( "Verifica o resultado listagem",
                () -> assertEquals(carrosDTO.get(0), result.get(0)),
                () -> assertEquals(carrosDTO.get(1), result.get(1))

        );
    }

    @Test
    public void editarCarrosTest() {
        // Mocando consulta e converção de objeto
        when(this.carroRepository.existsByIdAndUsuarioId(any(), any())).thenReturn(true);
        when(this.carroRepository.findByIdAndUsuarioId(any(),any())).thenReturn(Optional.of(carros.get(0)));
        when(this.carroRepository.save(any())).thenReturn(carros.get(0));
        when(converter.convertObject(carrosDTO.get(0), Carro.class)).thenReturn(carros.get(0));
        when(converter.convertObject(carros.get(0), CarroDTO.class)).thenReturn(carrosDTO.get(0));
        when(this.carroRepository.existsByLicensePlate(anyString())).thenReturn(false);

        // Executando
        CarroDTO result = carroService.editarCarros(carrosDTO.get(0), 1L, usuario);

        // Verificando resultado
        assertEquals(carrosDTO.get(0), result);
    }

    @Test
    public void editarCarrosIdNaoEncontradoTest() {
        // Mocando consulta e converção de objeto
        when(this.carroRepository.existsByIdAndUsuarioId(any(),any())).thenReturn(false);
        when(this.carroRepository.findByIdAndUsuarioId(any(),any())).thenReturn(Optional.of(carros.get(0)));

        when(this.carroRepository.save(any())).thenReturn(carros.get(0));
        when(converter.convertObject(carrosDTO.get(0), Carro.class)).thenReturn(carros.get(0));
        when(converter.convertObject(carros.get(0), CarroDTO.class)).thenReturn(carrosDTO.get(0));
        when(this.carroRepository.existsByLicensePlate(anyString())).thenReturn(false);

        // Executando
        Exception exception = assertThrows(SourceNotFoundException.class, () ->
                carroService.editarCarros(carrosDTO.get(0), 1L, usuario));

        // Verificando resultado
        String expectedMessage = "";
        String resultMessage = exception.getMessage();
        assertEquals(expectedMessage, resultMessage);
    }

    @Test
    public void editarCarrosIdPlacaJaExisteTest() {
        carros.get(0).setLicensePlate("aaaaa");

        // Mocando consulta e converção de objeto
        when(this.carroRepository.existsByIdAndUsuarioId(any(),any())).thenReturn(true);
        when(this.carroRepository.findByIdAndUsuarioId(any(),any())).thenReturn(Optional.of(carros.get(0)));
        when(this.carroRepository.existsByLicensePlate(any())).thenReturn(true);
        when(this.converter.convertObject(carrosDTO.get(0), Carro.class)).thenReturn(carros.get(0));


        // Executando
        Exception exception = assertThrows(BusinessException.class, () ->
                carroService.editarCarros(carrosDTO.get(0), 1L, usuario));

        // Verificando resultado
        String expectedMessage = "License plate already exists";
        String resultMessage = exception.getMessage();
        assertEquals(expectedMessage, resultMessage);
    }

    @Test
    public void removerCarroTest() {
        // Mocando consulta e converção de objeto
        when(this.carroRepository.existsByIdAndUsuarioId(anyLong(), anyLong())).thenReturn(true);

        // Executando
        carroService.removerCarro(1L, usuario);
    }

    @Test
    public void removerCarroCarroNaoEncontradoTest() {
        // Mocando consulta e converção de objeto
        when(this.carroRepository.existsById(any())).thenReturn(false);

        // Executando
        Exception exception = assertThrows(SourceNotFoundException.class, () ->
                carroService.removerCarro(1L, usuario));

        // Verificando resultado
        String expectedMessage = "";
        String resultMessage = exception.getMessage();
        assertEquals(expectedMessage, resultMessage);
    }

}
