package com.dio.lab.productCatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "product", type = "catalog")
public class Product {

    @Id
    private Long id;

    private String name;
    private  Integer amount;
}
