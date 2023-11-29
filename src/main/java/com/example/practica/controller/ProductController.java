package com.example.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica.model.Producto;
import com.example.practica.service.ProductoService;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductController {
    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto agregarProducto (@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @DeleteMapping("/{id}")
    public String deleteProducto (@PathVariable int producto){
        return productoService.deleteProducto(producto);
    }
    @PutMapping
    public Producto updateProducto (@RequestBody Producto producto){
        return productoService.updateProducto(producto);
    }
    @GetMapping
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }
    @GetMapping("/{id}")
    public Producto buscar (@PathVariable int id){
        return productoService.getProductoById(id);
    }


    
}
