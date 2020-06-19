package com.racoservices.repo;

import com.racoservices.model.DetalleVenta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleVenta extends JpaRepository<DetalleVenta, Integer>{
    
}