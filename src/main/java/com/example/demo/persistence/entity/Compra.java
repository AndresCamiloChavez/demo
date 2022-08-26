package com.example.demo.persistence.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "COMPRAS")
public class Compra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    
    @Column(name = "id_cliente")
    private Integer idCliente;
    
    private LocalDateTime fecha;
    
    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    public String getComentario() {
        return comentario;
    }
    public String getEstado() {
        return estado;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public Integer getIdCliente() {
        return idCliente;
    }
    public Integer getIdCompra() {
        return idCompra;
    }
    public String getMedioPago() {
        return medioPago;
    }
}
