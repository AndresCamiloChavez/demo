package com.example.demo.persistence;

import java.util.List;

import com.example.demo.persistence.crud.ProductoCrudRepository;
import com.example.demo.persistence.entity.Producto;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
