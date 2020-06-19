package com.racoservices.service.impl;

import java.util.List;

import com.racoservices.model.Producto;
import com.racoservices.repo.IProductoRepo;
import com.racoservices.service.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    IProductoRepo repo;

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Producto save(Producto producto) {
        return repo.save(producto);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
    
}