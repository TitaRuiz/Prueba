package com.example.prueba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoProductos extends JpaRepository<Producto, Integer> {

}
