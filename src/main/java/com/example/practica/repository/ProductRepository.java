package com.example.practica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.practica.model.Producto;
@Repository
public class ProductRepository {
    private List<Producto> productos = new ArrayList<>();
    public List<Producto> getAllProductos(){
        return productos;
    }

    public Producto findById(int id){
        for (int i=0;i<productos.size(); i++){
            if(productos.get(i).getId()== id){
                return productos.get(i);
            }

           }
           return null; 
    }

    public Producto save(Producto p){
        Producto  producto =  new Producto();
        producto.setId(p.getId());
        producto.setCantidad(p.getCantidad());
        producto.setNombre(p.getNombre());
        producto.setPrecio(p.getPrecio());
        productos.add(producto);
        return producto;
    
    }

    public String delete (int id){
        productos.removeIf(x -> x.getId() == id);
        return null;
    }

    public Producto update (Producto producto){
        int id=0;
        int idPos=0;
        
        for(int i =0; i<productos.size(); i++){
            if (productos.get(i).getId()== producto.getId()){
                id = producto.getId();
                idPos = i; 
                break;
            } 
        }
        Producto productoact = new Producto();
        productoact.setId(id);
        productoact.setNombre(producto.getNombre());
        productoact.setCantidad(producto.getCantidad());
        productoact.setPrecio(producto.getPrecio());
        productos.set(idPos,producto);
        return productoact;
    }

    
}
