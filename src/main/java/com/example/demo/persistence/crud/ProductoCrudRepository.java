package com.example.demo.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.persistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    
}
