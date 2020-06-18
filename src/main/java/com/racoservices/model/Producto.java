package com.racoservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "marca", nullable = false, length = 100)
    private String marca;

}