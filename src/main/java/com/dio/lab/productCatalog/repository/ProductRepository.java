package com.dio.lab.productCatalog.repository;

import com.dio.lab.productCatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
