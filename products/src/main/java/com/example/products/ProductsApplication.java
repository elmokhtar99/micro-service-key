package com.example.products;

import com.example.products.clients.Supplier;
import com.example.products.clients.SupplierServiceClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

//	@Bean
//	CommandLineRunner start(SupplierServiceClient supplierServiceClient){
//		return args -> {
//			System.out.println(supplierServiceClient.getSupplierById(1L));
//		};
//	}

}
