package com.desafio.pitang.desafio_pitang.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode
@Table(name = "tb_carro")
@AllArgsConstructor
@NoArgsConstructor
public class Carro {

    @Id
    @GeneratedValue(generator="tb_carro_id_seq")
    @SequenceGenerator(name="tb_carro_id_seq",sequenceName="tb_carro_id_seq", allocationSize=1)
    private Long id;
    @Column(name = "car_year")
    private Integer year;
    @Column(name = "license_plate", unique = true)
    private String licensePlate;
    private String model;
    private String color;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
