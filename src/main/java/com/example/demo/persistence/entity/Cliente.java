package com.example.demo.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "CLIENTES")
public class Cliente {

    @Id
    private String id;
    
    private String nombre;

    private String apellidos;

    private Double celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    List<Compra> compras;

    public String getApellidos() {
        return apellidos;
    }
    public Double getCelular() {
        return celular;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setCelular(Double celular) {
        this.celular = celular;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
