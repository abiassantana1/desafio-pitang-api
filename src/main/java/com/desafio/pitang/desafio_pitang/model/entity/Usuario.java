package com.desafio.pitang.desafio_pitang.model.entity;

import com.desafio.pitang.desafio_pitang.model.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "tb_usuario")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(generator="tb_usuario_id_seq")
    @SequenceGenerator(name="tb_usuario_id_seq",sequenceName="tb_usuario_id_seq", allocationSize=1)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;
    private Date birthday;
    @Column(name = "login", unique = true)
    private String login;
    private String password;
    private String phone;
    private UserRole role;
    private Date lastLogin;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
    private List<Carro> cars;
    @Column(name = "createdAt", nullable = false)
    private Date createdAt;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.role == UserRole.USER) return List.of(new SimpleGrantedAuthority("ROLE_USER"));
        if(this.role == UserRole.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"));
        else return List.of();
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
