package com.desafio.pitang.desafio_pitang.service;

import com.desafio.pitang.desafio_pitang.exception.BusinessException;
import com.desafio.pitang.desafio_pitang.exception.MultipleBusinessException;
import com.desafio.pitang.desafio_pitang.mapper.ConverterDTO;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioDTO;
import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.repository.UsuarioRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @InjectMocks
    UsuarioService usuarioService;

    @Mock
    ConverterDTO converter;

    @Mock
    UsuarioRepository usuarioRepository;

    @Mock
    BCryptPasswordEncoder passwordEncoder;

    Usuario usuario;

    UsuarioDTO usuarioDTO;

    @Before
    public void setup() {

        MockitoAnnotations.openMocks(this);

        usuario = new Usuario();
        usuario.setId(1L);
        usuario.setEmail("test@gmail.com");
        usuario.setLogin("login");
        usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(1L);
        usuarioDTO.setEmail("test@gmail.com");
        usuarioDTO.setLogin("login");
    }

    @Test
    public void cadastrarUsuariosTest() {

        when(usuarioRepository.existsByEmail(any())).thenReturn(false);
        when(usuarioRepository.existsByLogin(any())).thenReturn(false);
        when(usuarioRepository.save(any())).thenReturn(usuario);
        when(converter.convertObject(usuarioDTO, Usuario.class)).thenReturn(usuario);
        when(converter.convertObject(usuario, UsuarioDTO.class)).thenReturn(usuarioDTO);
        when(passwordEncoder.encode(any())).thenReturn("");


        UsuarioDTO result = usuarioService.cadastrarUsuarios(usuarioDTO);

        assertEquals(usuarioDTO, result);
    }

    @Test
    public void validarUsuarioEmailExiste() {
        when(usuarioRepository.existsByEmail(any())).thenReturn(true);
        when(usuarioRepository.existsByLogin(any())).thenReturn(false);

        Exception exception = assertThrows(MultipleBusinessException.class, () -> {
            usuarioService.cadastrarUsuarios(usuarioDTO);
        });

        String expectedMessage = "Email already exists";
        String resultMessage = ((MultipleBusinessException) exception).getExceptions().get(0).getMessage();

        assertEquals(expectedMessage, resultMessage);
    }

    @Test
    public void validarUsuarioLoginExiste() {
        when(usuarioRepository.existsByEmail(any())).thenReturn(false);
        when(usuarioRepository.existsByLogin(any())).thenReturn(true);

        Exception exception = assertThrows(MultipleBusinessException.class, () -> usuarioService.cadastrarUsuarios(usuarioDTO));

        String expectedMessage = "Login already exists";
        String resultMessage = ((MultipleBusinessException) exception).getExceptions().get(0).getMessage();

        assertEquals(expectedMessage, resultMessage);
    }

    @Test
    public void validarUsuarioEmailLoginExiste() {
        when(usuarioRepository.existsByEmail(any())).thenReturn(true);
        when(usuarioRepository.existsByLogin(any())).thenReturn(true);

        Exception exception = assertThrows(MultipleBusinessException.class, () -> usuarioService.cadastrarUsuarios(usuarioDTO));

        String expectedMessage1 = "Email already exists";
        String expectedMessage2 = "Login already exists";
        List<BusinessException> result = ((MultipleBusinessException) exception).getExceptions();

        // Verifica o resultado
        assertAll( "Verifica o resultado listagem",
                () -> assertEquals(expectedMessage1, result.get(0).getMessage()),
                () -> assertEquals(expectedMessage2, result.get(1).getMessage())

        );
    }

}