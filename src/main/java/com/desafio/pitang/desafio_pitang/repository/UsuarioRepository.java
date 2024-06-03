package com.desafio.pitang.desafio_pitang.repository;

import com.desafio.pitang.desafio_pitang.model.entity.Usuario;
import com.desafio.pitang.desafio_pitang.model.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
    boolean existsByLogin(String login);
    UserDetails findByLogin(String login);
    List<Usuario> findAllByRole(UserRole userRole);
}
