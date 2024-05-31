package com.desafio.pitang.desafio_pitang.repository;


import com.desafio.pitang.desafio_pitang.model.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    boolean existsByLicensePlate(String licensePlate);

    List<Carro> findAllByUsuarioId(Long idUsuario);

    Optional<Carro> findByIdAndUsuarioId(Long id, Long idUsuario);

    boolean existsByIdAndUsuarioId(Long id, Long usuarioId);
}
