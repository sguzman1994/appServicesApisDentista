package com.odotologiati.dentista.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "paciente")
class Paciente(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column
    val name: String = "",
    @Column
    val user: String = "",
    @Column
    val pass: String = "",
    @Column
    val email: String = ""
)