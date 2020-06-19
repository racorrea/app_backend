package com.racoservices.repo;

import com.racoservices.model.Venta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepo  extends JpaRepository<Venta, Integer>{
    
}