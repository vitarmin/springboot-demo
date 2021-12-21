package com.example.demo.app.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.app.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
	private static Map<Integer, Product> productRepo = new HashMap<>();
	   static {
	      Product honey = new Product( 1 , "Honey");
	      productRepo.put(honey.getId(), honey);
	      
	      Product almond = new Product(2, "Almond");
	      productRepo.put(almond.getId(), almond);
	   }
	   
	   @DeleteMapping("/products/{id}")
	   public ResponseEntity<Object> delete(int id) { 
	      productRepo.remove(id);
	      return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @PutMapping("/products/{id}")
	   public Product updateProduct(Integer id,  Product product) { 
	      Product oldProduct = productRepo.get(id);
		  oldProduct.setName(product.getName());
	      
	      return product;
	   }
	   
	   @PostMapping("/products" )
	   public Product createProduct(@RequestBody Product product) {
	      productRepo.put(product.getId(), product);
	      return product;
	   }
	   
	   @GetMapping("/products")
	   public Collection<Product> getProduct() {
	      return productRepo.values();
	   }
}
