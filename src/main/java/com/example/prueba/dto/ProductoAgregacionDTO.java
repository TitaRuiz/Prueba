package com.example.prueba.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoAgregacionDTO {

    private Long suma;

    public ProductoAgregacionDTO(Long suma) {
        this.suma = suma;
    }
}
