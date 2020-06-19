package com.racoservices.service;

import java.util.List;

import com.racoservices.model.Persona;

public interface IPersonaService {
    public List<Persona> listar();
    public Persona findById(Integer id);
    public Persona save (Persona persona);
    public void delete (Integer id);
}