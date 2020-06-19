package com.racoservices.service;

import java.util.List;

import com.racoservices.model.Producto;

public interface IProductoService {
    public List<Producto> listar();
    public Producto findById(Integer id);
    public Producto save (Producto producto);
    public void delete (Integer id);
}