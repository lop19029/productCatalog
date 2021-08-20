package com.dio.lab.productCatalog.controller;

import com.dio.lab.productCatalog.model.Product;
import com.dio.lab.productCatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    @RequestMapping(value = "/{id}")
    Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }
}
