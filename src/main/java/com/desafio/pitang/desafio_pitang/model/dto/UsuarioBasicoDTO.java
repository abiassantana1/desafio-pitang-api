package com.desafio.pitang.desafio_pitang.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioBasicoDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String birthday;

    private String login;

    private String phone;

    private Date lastLogin;
}
