package com.example.prueba.dto;

import lombok.Data;

@Data
public class ProductoAgrupacionDTO {
    private Short categoriaId;
    private Double promedio;

    public ProductoAgrupacionDTO(Short categoriaId, Double promedio) {
        this.categoriaId = categoriaId;
        this.promedio = promedio;
    }
}
