package com.racoservices.service.impl;

import java.util.List;

import com.racoservices.model.Persona;
import com.racoservices.repo.IPersonaRepo;
import com.racoservices.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    IPersonaRepo repo;

    @Override
    public List<Persona> listar() {
        return repo.findAll();
    }

    @Override
    public Persona findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Persona save(Persona persona) {
        return repo.save(persona);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
    
}