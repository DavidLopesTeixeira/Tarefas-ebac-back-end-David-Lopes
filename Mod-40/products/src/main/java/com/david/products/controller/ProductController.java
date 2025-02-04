package com.david.products.controller;

import com.david.products.entity.Product;
import com.david.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping()
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(service.create(product), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable long id) {
        return new ResponseEntity<>(service.findbyId(id), HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<Product>> products() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.FOUND);
    }
}
