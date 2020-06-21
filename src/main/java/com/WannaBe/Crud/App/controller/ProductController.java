package com.WannaBe.Crud.App.controller;

import com.WannaBe.Crud.App.entity.Product;
import com.WannaBe.Crud.App.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    public Product findProductById(int id){
        return service.getProductById(id);
    }

    public Product findProductByName(String name){
        return service.getProductById(name);
    }
}
