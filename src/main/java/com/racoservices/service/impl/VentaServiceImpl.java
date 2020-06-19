package com.racoservices.service.impl;

import java.util.List;

import com.racoservices.model.Venta;
import com.racoservices.repo.IVentaRepo;
import com.racoservices.service.IVentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl implements IVentaService {

    @Autowired
    IVentaRepo repo;

    @Override
    public List<Venta> listar() {
        return repo.findAll();
    }

    @Override
    public Venta findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Venta save(Venta venta) {
        return repo.save(venta);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
    
}