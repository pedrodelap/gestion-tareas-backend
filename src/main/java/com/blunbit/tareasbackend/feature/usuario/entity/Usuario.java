package com.blunbit.tareasbackend.feature.usuario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Usuario {

    @Id
    @Column(name = "usu_codigo", nullable = false)
    private Integer id;

    @Column(name = "usu_username", length = 100)
    private String username;

    @Column(name = "usu_email", length = 150)
    private String email;

    @Column(name = "usu_password")
    private String password;

    @Column(name = "usu_nombre_completo")
    private String nombreCompleto;

    @Column(name = "usu_avatar")
    private String avatar;

    @Column(name = "usu_estado")
    private Short estado;
}
