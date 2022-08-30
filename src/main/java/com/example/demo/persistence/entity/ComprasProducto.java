package com.example.demo.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "COMPRAS_PRODUCTO")
public class ComprasProducto{
    
    @EmbeddedId // cuando es compuesta
    private ComprasProductoPK id;
    
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public void setId(ComprasProductoPK id) {
        this.id = id;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public Boolean getEstado() {
        return estado;
    }
    public ComprasProductoPK getId() {
        return id;
    }
    public Double getTotal() {
        return total;
    }
}