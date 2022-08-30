package com.example.demo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;
    
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;
    

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;


    public Integer getCantidadStock() {
        return cantidadStock;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public Integer getIdCategoria() {
        return idCategoria;
    }
    public Integer getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public Double getPrecioVenta() {
        return precioVenta;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
