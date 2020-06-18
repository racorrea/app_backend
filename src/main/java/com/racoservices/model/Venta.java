package com.racoservices.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.racoservices.model.Persona;

@Entity
@Table(name = "ventas")
public class Venta {

    /**
     * Venta [Crear] ----------- idVenta : int fecha : LocalDateTime idPersona :
     * Persona importe : double
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenta;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_persona"))
    private Persona persona;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(final Integer idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(final LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(final Persona persona) {
        this.persona = persona;
    }

    


}