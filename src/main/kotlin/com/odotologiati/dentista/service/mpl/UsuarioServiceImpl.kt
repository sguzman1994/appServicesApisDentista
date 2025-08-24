package com.odotologiati.dentista.service.mpl

import com.odotologiati.dentista.commons.GenericServiceImpl
import com.odotologiati.dentista.model.Usuario
import com.odotologiati.dentista.repository.UsuarioRepository
import com.odotologiati.dentista.service.api.UsuarioServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class UsuarioServiceImpl : GenericServiceImpl<Usuario, Long>(), UsuarioServiceApi {

    @Autowired
    lateinit var UsuarioRepository: UsuarioRepository

    override fun getDao(): CrudRepository<Usuario, Long> {
        return UsuarioRepository;
    }
}