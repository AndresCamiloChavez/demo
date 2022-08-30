package com.example.demo.persistence.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


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


    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;


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
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

}
