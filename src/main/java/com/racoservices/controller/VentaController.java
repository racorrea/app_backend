package com.racoservices.controller;

import java.util.List;

import com.racoservices.model.Venta;
import com.racoservices.service.IVentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    
    @Autowired
    IVentaService service;

    @GetMapping
    public List<Venta> listar(){
        return service.listar();
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta venta){
        return service.save(venta);
    }


}