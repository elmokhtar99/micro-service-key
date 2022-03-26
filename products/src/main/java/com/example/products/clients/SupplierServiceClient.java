package com.example.products.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name="SUPP-SERVICE")
public interface SupplierServiceClient {
    @GetMapping(path= "/suppliers/{id}")
    public Supplier getSupplierById(@RequestHeader("Authorization") String token, @PathVariable(name = "id") Long id);
    @GetMapping(path = "/suppliers")
    public List<Supplier> findAll();
}
