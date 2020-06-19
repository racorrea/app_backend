package com.racoservices.service;

import java.util.List;

import com.racoservices.model.DetalleVenta;

public interface IDetalleVentaService{
    public List<DetalleVenta> listar();
    public DetalleVenta findById(Integer id);
    public DetalleVenta save (DetalleVenta detalleVenta);
    public void delete (Integer id);
}