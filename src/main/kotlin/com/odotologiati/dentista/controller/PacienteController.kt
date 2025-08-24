package com.odotologiati.dentista.controller

import com.odotologiati.dentista.model.Paciente
import com.odotologiati.dentista.service.api.PacienteServiceApi
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

class PacienteController {

    @Autowired
    lateinit var PacienteServicesApi: PacienteServiceApi

    @GetMapping("/all")
    fun getAll(): MutableList<Paciente> {
        return PacienteServicesApi.all;
    }

    @PostMapping("/save")
    fun save(@RequestBody paciente: Paciente): ResponseEntity<Paciente> {
        var obj = PacienteServicesApi.save(paciente)
        return ResponseEntity<Paciente>(paciente, HttpStatus.OK)
    }

    @GetMapping("/delete/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Paciente> {
        if (PacienteServicesApi.get(id) != null) {
            PacienteServicesApi.delete(id)
        } else {
            return ResponseEntity<Paciente>(HttpStatus.NOT_FOUND)
        }
        return ResponseEntity<Paciente>(HttpStatus.OK)
    }
}