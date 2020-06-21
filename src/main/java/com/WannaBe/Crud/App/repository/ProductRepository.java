package com.WannaBe.Crud.App.repository;

import com.WannaBe.Crud.App.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer> {
    Product findByName(String name);
}
