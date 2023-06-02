package com.example.prueba.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoProyeccionDTO {
    private Short id;
    private String nombre;

    public ProductoProyeccionDTO(Short id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
