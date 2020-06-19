package com.racoservices.service.impl;

import java.util.List;

import com.racoservices.model.DetalleVenta;
import com.racoservices.repo.IDetalleVenta;
import com.racoservices.service.IDetalleVentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {
    @Autowired
    IDetalleVenta repo;

    @Override
    public List<DetalleVenta> listar() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    @Override
    public DetalleVenta findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public DetalleVenta save(DetalleVenta detalleVenta) {
        // TODO Auto-generated method stub
        return repo.save(detalleVenta);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub

    }


}