package com.odotologiati.dentista.service.mpl

import com.odotologiati.dentista.commons.GenericServiceImpl
import com.odotologiati.dentista.model.Paciente
import com.odotologiati.dentista.repository.PacienteRepository
import com.odotologiati.dentista.service.api.PacienteServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class PacienteServiceImpl : GenericServiceImpl<Paciente, Long>(), PacienteServiceApi {

    @Autowired
    lateinit var PacienteRepositiry: PacienteRepository

    override fun getDao(): CrudRepository<Paciente, Long> {
        return PacienteRepositiry;
    }
}