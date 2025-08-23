package com.odotologiati.dentista.repository

import com.odotologiati.dentista.model.Paciente
import org.springframework.data.repository.CrudRepository

interface PacienteRepository : CrudRepository<Paciente, Long> {


}