package com.odotologiati.dentista.repository

import com.odotologiati.dentista.model.Usuario
import org.springframework.data.repository.CrudRepository

interface UsuarioRepository : CrudRepository<Usuario, Long> {

}