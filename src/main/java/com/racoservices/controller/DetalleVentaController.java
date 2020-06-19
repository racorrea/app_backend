package com.racoservices.controller;

import java.util.List;

import com.racoservices.model.DetalleVenta;
import com.racoservices.service.IDetalleVentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
    
    @Autowired
    IDetalleVentaService service;

    @GetMapping
    public List<DetalleVenta> listar(){
        return service.listar();
    }

    @PostMapping
    public DetalleVenta guardar(@RequestBody DetalleVenta detalleVenta){
        return service.save(detalleVenta);
    }


}