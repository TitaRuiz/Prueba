package com.example.prueba.controlador;

import com.example.prueba.dto.ProductoDTO;
import com.example.prueba.modelo.Producto;
import com.example.prueba.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/productos")
public class ProductoControlador {
    @Autowired
    private IProductoServicio servicio;
    @GetMapping("/promediosproveedor")
    public List<ProductoDTO> promedioPorProveedor() throws Exception {
        List<Producto> todos = servicio.listar();


        List<ProductoDTO> promedios = todos.stream()
                .filter(p -> p.getPrecioUnitario() != null)
                .collect(Collectors.groupingBy(Producto::getProveedor, Collectors.averagingDouble(Producto::getPrecioUnitario)))
                .entrySet()
                .stream()
                .map(entry -> new ProductoDTO(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        return promedios;
    }
    @GetMapping("/inventarioproveedor")
    public List<ProductoDTO> inventarioPorProveedor() throws Exception {
        List<Producto> todos = servicio.listar();
        List<ProductoDTO> suma = todos.stream()
                .filter(p->p.getPrecioUnitario()!=null && p.getUnidadesExistencia()!=null)
                .collect(Collectors.groupingBy(Producto::getProveedor,Collectors.summingDouble(Producto::getPrecioUnitario)))
                .entrySet()
                .stream()
                .map(e -> new ProductoDTO(e.getKey(),e.getValue()))
                .collect(Collectors.toList());
        return suma;


    }


}
