package com.odotologiati.dentista.controller
import com.odotologiati.dentista.service.api.UsuarioServiceApi
import com.odotologiati.dentista.model.Paciente
import com.odotologiati.dentista.model.Usuario
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")

class UsuarioController {
    @Autowired
    lateinit var UsuarioServiceApi: UsuarioServiceApi

    @GetMapping("/allUsers")
    fun getAll(): MutableList<Usuario> {
        return UsuarioServiceApi.all;
    }

    @PostMapping("/saveUsers")
    fun save(@RequestBody Usuario: Usuario): ResponseEntity<Usuario> {
        var obj = UsuarioServiceApi.save(Usuario)
        return ResponseEntity<Usuario>(Usuario, HttpStatus.OK)
    }

    @GetMapping("/deleteUsers/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Usuario> {
        if (UsuarioServiceApi.get(id) != null) {
            UsuarioServiceApi.delete(id)
        } else {
            return ResponseEntity<Usuario>(HttpStatus.NOT_FOUND)
        }
        return ResponseEntity<Usuario>(HttpStatus.OK)
    }
}