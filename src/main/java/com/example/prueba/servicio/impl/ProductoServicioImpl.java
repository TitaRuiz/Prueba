package com.example.prueba.servicio.impl;

import com.example.prueba.dto.ProductoAgregacionDTO;
import com.example.prueba.dto.ProductoAgrupacionDTO;
import com.example.prueba.dto.ProductoDTO;
import com.example.prueba.dto.ProductoProyeccionDTO;
import com.example.prueba.modelo.Producto;
import com.example.prueba.repo.IGenericRepo;
import com.example.prueba.repo.IProductosRepo;
import com.example.prueba.servicio.IProductoServicio;
import com.example.prueba.servicio.impl.CRUDImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl extends CRUDImpl<Producto,Short> implements IProductoServicio {

    @Autowired
    private IProductosRepo repo;


    @Override
    protected IGenericRepo<Producto, Short> getRepo() {
        return repo;
    }



    @Override
    public List<Producto> filtrarTexto(String texto) {
        return repo.filtroPorTexto(texto);
    }

    @Override
    public List<Producto> toda() {
        return repo.toda();
    }

    @Override
    public List<ProductoProyeccionDTO> proyeccion() {
        return repo.proyeccion();
    }

    @Override
    public List<ProductoAgregacionDTO> agregacion() {
        return repo.agregacion();
    }

    @Override
    public List<ProductoAgrupacionDTO> agrupacionPromedio() {
        return repo.agrupacionPromedio();
    }
}
