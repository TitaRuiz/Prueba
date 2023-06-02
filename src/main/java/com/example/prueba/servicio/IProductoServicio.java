package com.example.prueba.servicio;

import com.example.prueba.dto.ProductoAgregacionDTO;
import com.example.prueba.dto.ProductoAgrupacionDTO;
import com.example.prueba.dto.ProductoDTO;
import com.example.prueba.dto.ProductoProyeccionDTO;
import com.example.prueba.modelo.Producto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductoServicio extends ICRUD<Producto,Short>{
    public List<Producto> filtrarTexto(String texto);
    public List<Producto> toda();

    public List<ProductoProyeccionDTO> proyeccion();

    List<ProductoAgregacionDTO> agregacion();

    List<ProductoAgrupacionDTO> agrupacionPromedio();

}
