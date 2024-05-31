package com.desafio.pitang.desafio_pitang.service;

import com.desafio.pitang.desafio_pitang.exception.BusinessException;
import com.desafio.pitang.desafio_pitang.exception.SourceNotFoundException;
import com.desafio.pitang.desafio_pitang.mapper.ConverterDTO;
import com.desafio.pitang.desafio_pitang.model.dto.CarroDTO;
import com.desafio.pitang.desafio_pitang.model.dto.UsuarioDTO;
import com.desafio.pitang.desafio_pitang.model.entity.Carro;
import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.repository.CarroRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarroService {

    private ConverterDTO converter;

    private final CarroRepository carroRepository;

    @Transactional
    public CarroDTO cadastrarCarros(CarroDTO carroDTO, Usuario usuario) {
        this.validarCarro(carroDTO);
        Carro carro = (Carro) this.converter.convertObject(carroDTO, Carro.class);
        carro.setUsuario(usuario);
        carro = this.carroRepository.save(carro);
        return (CarroDTO) this.converter.convertObject(carro , CarroDTO.class);
    }

    private void validarCarro(CarroDTO carroDTO) {
        if(this.carroRepository.existsByLicensePlate(carroDTO.getLicensePlate())){
            throw new BusinessException("License plate already exists");
        }
    }

    public List<CarroDTO> listarCarros(Usuario usuario) {
        return this.converter.converterListObjects(this.carroRepository.findAllByUsuarioId(usuario.getId()), CarroDTO.class);
    }

    @Transactional
    public CarroDTO editarCarros(CarroDTO carroDTO, Long id, Usuario usuario) {
        if(carroRepository.existsByIdAndUsuarioId(id, usuario.getId())) {
            Carro carroAntigo = carroRepository.findByIdAndUsuarioId(id, usuario.getId())
                    .orElseThrow(() -> new SourceNotFoundException(""));
            if(!carroAntigo.getLicensePlate().equals(carroDTO.getLicensePlate())) {
                this.validarCarro(carroDTO);
            }
            Carro carro = (Carro) this.converter.convertObject(carroDTO, Carro.class);
            carro.setId(id);
            carro.setUsuario(usuario);
            return (CarroDTO) this.converter.convertObject(this.carroRepository.save(carro) , CarroDTO.class);
        } else {
            throw new SourceNotFoundException("");
        }
    }

    @Transactional
    public void removerCarro(Long id, Usuario usuario) {
        if(carroRepository.existsByIdAndUsuarioId(id, usuario.getId())) {
            this.carroRepository.deleteById(id);
        } else {
            throw new SourceNotFoundException("");
        }
    }

    public CarroDTO buscarCarro(Long id, Usuario usuario) {
        Carro carro = this.carroRepository.findByIdAndUsuarioId(id, usuario.getId())
                .orElseThrow(() -> new SourceNotFoundException(""));
        return (CarroDTO) this.converter.convertObject(carro, CarroDTO.class);
    }

}
