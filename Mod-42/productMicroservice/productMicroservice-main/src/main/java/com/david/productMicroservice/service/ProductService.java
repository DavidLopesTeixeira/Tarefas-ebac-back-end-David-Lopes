package com.david.productMicroservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.david.productMicroservice.entity.Product;
import com.david.productMicroservice.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product findById(Long id) throws RuntimeException {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public List<Product> findAllproducts() {
        return repository.findAll();
    }

    public Product update(Long id, Product product) throws RuntimeException {
        Product p = findById(id);

        p.setName(product.getName());
        p.setPrice(product.getPrice());

        return repository.save(p);
    }

    public void delete(Long id) throws RuntimeException {
        Product p = findById(id);
        repository.delete(p);
    }
}
