package com.example.products.controller;

import com.example.products.clients.Supplier;
import com.example.products.clients.SupplierServiceClient;
import com.example.products.entities.Product;
import com.example.products.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;
    private SupplierServiceClient supplierServiceClient;

    public ProductController(ProductRepository productRepository, SupplierServiceClient supplierServiceClient) {
        this.productRepository = productRepository;
        this.supplierServiceClient = supplierServiceClient;
    }


    @GetMapping("/supp/{id}")
    public Supplier getSupplierById(@RequestHeader("Authorization") String token, @PathVariable(name = "id") Long id){
        return supplierServiceClient.getSupplierById(token, id);
    }

    @PostMapping("/add-product")
    public Product add(@RequestBody Product product){
        return  productRepository.save(product);
    }
}
