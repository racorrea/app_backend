package com.racoservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

    /**
     * DetalleVenta ------------ idDetalleVenta : int idVenta : Venta idProducto :
     * Producto cantidad : int
     */

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer idDetalleVenta;

     @ManyToOne
     @JoinColumn(name = "id_venta", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_detalleVenta"))
     private Venta venta;

     @ManyToOne
     @JoinColumn(name = "id_producto", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_detalleVenta"))
     private Producto producto;

     @Column(name = "cantidad", nullable = false)
     private Integer cantidad;

     public Integer getIdDetalleVenta() {
         return idDetalleVenta;
     }

     public void setIdDetalleVenta(final Integer idDetalleVenta) {
         this.idDetalleVenta = idDetalleVenta;
     }

     public Venta getVenta() {
         return venta;
     }

     public void setVenta(final Venta venta) {
         this.venta = venta;
     }

     public Producto getProducto() {
         return producto;
     }

     public void setProducto(final Producto producto) {
         this.producto = producto;
     }

     public Integer getCantidad() {
         return cantidad;
     }

     public void setCantidad(final Integer cantidad) {
         this.cantidad = cantidad;
     }

     

}