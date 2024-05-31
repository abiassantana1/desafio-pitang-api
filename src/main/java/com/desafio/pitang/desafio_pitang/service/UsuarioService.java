package com.desafio.pitang.desafio_pitang.service;


import com.desafio.pitang.desafio_pitang.exception.BusinessException;
import com.desafio.pitang.desafio_pitang.exception.MultipleBusinessException;
import com.desafio.pitang.desafio_pitang.mapper.ConverterDTO;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioBasicoDTO;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioDTO;
import com.desafio.pitang.desafio_pitang.model.enums.UserRole;
import com.desafio.pitang.desafio_pitang.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.desafio.pitang.desafio_pitang.model.entity.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private ConverterDTO converter;

    private final UsuarioRepository usuarioRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public List<UsuarioBasicoDTO> listarUsuarios() {
        return this.converter.converterListObjects(this.usuarioRepository.findAll(), UsuarioBasicoDTO.class);
    }

    @Transactional(rollbackOn = Throwable.class)
    public UsuarioDTO cadastrarUsuarios(UsuarioDTO usuarioDTO) {
        this.validarUsuario(usuarioDTO);
        Usuario usuario = (Usuario) this.converter.convertObject(usuarioDTO, Usuario.class);
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuario.setCreatedAt(new Date());
        usuario.setRole(UserRole.USER);
        usuario = this.usuarioRepository.save(usuario);
        return (UsuarioDTO) this.converter.convertObject(usuario , UsuarioDTO.class);
    }



    private void validarUsuario(UsuarioDTO usuario) {
        List<BusinessException> exceptions = new ArrayList<>();
        if(this.usuarioRepository.existsByEmail(usuario.getEmail())){
            exceptions.add(new BusinessException("Email already exists"));
        }
        if(this.usuarioRepository.existsByLogin(usuario.getLogin())){
            exceptions.add(new BusinessException("Login already exists"));
        }
        if (!exceptions.isEmpty()) {
            throw new MultipleBusinessException(exceptions);
        }
    }

    public void atualizarUltimoLogin(Usuario usuario) {
        usuario.setLastLogin(new Date());
        this.usuarioRepository.save(usuario);
    }


}
