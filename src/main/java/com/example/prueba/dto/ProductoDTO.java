package com.example.prueba.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoDTO {
    private Short categoriaId;
    private Short proveedor;
    private double precioUnitario;

    public ProductoDTO(Short proveedor, double resumen) {
        this.proveedor = proveedor;
        this.precioUnitario = resumen;
    }
    public ProductoDTO( double resumen, Short categoriaId ) {
        this.proveedor = proveedor;
        this.precioUnitario = resumen;
    }

    public ProductoDTO(Short proveedor, Short categoriaId, double precioUnitario) {
        this.proveedor = proveedor;
        this.categoriaId = categoriaId;
        this.precioUnitario = precioUnitario;
    }
}
