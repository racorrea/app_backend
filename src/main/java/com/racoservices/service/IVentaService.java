package com.racoservices.service;

import java.util.List;

import com.racoservices.model.Venta;

public interface IVentaService {
    public List<Venta> listar();
    public Venta findById(Integer id);
    public Venta save (Venta venta);
    public void delete (Integer id);
}