package com.odotologiati.dentista.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity(name = "tbl_usuario")
class Usuario(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_CodigoUsuario")
    val id: Long = 0,

    @Column(name = "i_CodigoTipoUsuario", nullable = false)
    val tipoUsuario: Long = 0,

    @Column(name = "v_NombreUsuario", nullable = false, length = 50)
    val nombre: String? = "",

    @Column(name = "v_ApellidoUsuario", nullable = false, length = 50)
    val apellido: String? ="",

    @Column(name = "v_CorreoElectronico", nullable = false, length = 40, unique = true)
    val correo: String? ="",

    @Column(name = "v_Contrasena", nullable = false, length = 40)
    val contrasena: String ? = "",

    @Column(name = "v_dni", nullable = false, length = 8, unique = true)
    val dni: String? ="",

    @Column(name = "i_token", nullable = false, length = 6)
    val token: String? = "",

    @Column(name = "b_Foto", length = 20)
    val foto: String? = null,

    @Column(name = "i_Id_Logueo", nullable = false)
    val idLogueo: Int = 0,

    @Column(name = "f_FechaNacimiento")
    val fechaNacimiento: java.sql.Date? = null,

    @Column(name = "i_edad", length = 50)
    val edad: String? = null,

    @Column(name = "v_Direccion", length = 70)
    val direccion: String? = null,

    @Column(name = "v_Telefono", length = 15)
    val telefono: String? = null,

    @Column(name = "v_Celular", length = 15)
    val celular: String? = null,

    @Column(name = "v_Ocupacion", length = 100)
    val ocupacion: String? = null,

    @Column(name = "i_EstadoUsuario")
    val estadoUsuario: Long? = 0,

    @Column(name = "i_UsuarioCreacion")
    val usuarioCreacion: Long? = null,

    @Column(name = "f_FechaCreacion")
    val fechaCreacion: LocalDateTime? = null,

    @Column(name = "i_UsuarioModificacion")
    val usuarioModificacion: Long? = null,

    @Column(name = "f_FechaModificacion")
    val fechaModificacion: LocalDateTime? = null,

    @Column(name = "v_Referencia", length = 50)
    val referencia: String? = "No Existe"
)