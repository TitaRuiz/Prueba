package com.example.prueba.servicio;

import com.example.prueba.modelo.Producto;
import com.example.prueba.repo.IGenericRepo;
import com.example.prueba.repo.IProductosRepo;
import com.example.prueba.servicio.impl.CRUDImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl extends CRUDImpl<Producto,Short> implements IProductoServicio{

    @Autowired
    private IProductosRepo repo;


    @Override
    protected IGenericRepo<Producto, Short> getRepo() {
        return repo;
    }
}
