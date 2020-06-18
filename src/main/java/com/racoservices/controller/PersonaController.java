package com.racoservices.controller;

import java.util.List;

import com.racoservices.model.Persona;
import com.racoservices.service.IPersonaService;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    @Autowired
    IPersonaService service;

    @GetMapping
    public List<Persona> listar (){
        return service.listar();
    }

    @PostMapping
    public Persona guardar(@RequestBody Persona persona){
        return service.save(persona);
    }

    @PutMapping("/{id}")
    public Persona actualizar(@RequestBody Persona persona, @PathVariable Integer id){
        Persona npersona = service.findById(id);

        npersona.setNombres(persona.getNombres());
        npersona.setApellidos(persona.getApellidos());

        return service.actualizar(npersona);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id){
        return service.delete(id);
    }

}