package com.example.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica.model.Producto;
import com.example.practica.repository.ProductRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductRepository productRepository;
    public Producto saveProducto(Producto producto){
        return productRepository.save(producto);
    }
    public List<Producto> getProductos(){
        return productRepository.getAllProductos();
    }
    public String deleteProducto(int producto){
        return productRepository.delete(producto);
    }
    public Producto updateProducto(Producto producto){
        return productRepository.update(producto);
    }
    public Producto getProductoById(int id){
        return productRepository.findById(id);
    }
}
