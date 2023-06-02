package com.example.prueba.repo;

import com.example.prueba.dto.ProductoAgregacionDTO;
import com.example.prueba.dto.ProductoAgrupacionDTO;
import com.example.prueba.dto.ProductoDTO;
import com.example.prueba.dto.ProductoProyeccionDTO;
import com.example.prueba.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductosRepo extends IGenericRepo<Producto, Short> {
    @Query("select new com.example.prueba.dto.ProductoAgrupacionDTO(p.categoriaId, avg(p.precioUnitario)) from Producto p group by p.categoriaId")
    List<ProductoAgrupacionDTO> agrupacionPromedio();

    @Query("select new com.example.prueba.dto.ProductoProyeccionDTO(p.id, p.nombre) from Producto p order by p.nombre desc ")
    List<ProductoProyeccionDTO> proyeccion();
    @Query("select new com.example.prueba.dto.ProductoAgregacionDTO(sum(p.unidadesExistencia)) from Producto p")
    List<ProductoAgregacionDTO> agregacion();


    @Query("FROM Producto p WHERE p.nombre LIKE %:texto%")
    List<Producto> filtroPorTexto(@Param("texto") String texto);
    @Query("FROM Producto p")
    List<Producto> toda();




//
//    @Query(value="Select * from Products where category_id=:categoriaId", nativeQuery = true)
//    List<Producto> filtroPorCategoriaNativa(@Param("categoriaId") int categoriaId);



}
