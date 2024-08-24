package com.costara.project_dikaion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costara.project_dikaion.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
