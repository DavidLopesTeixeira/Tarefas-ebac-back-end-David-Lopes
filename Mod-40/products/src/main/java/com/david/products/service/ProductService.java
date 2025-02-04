package com.david.products.service;

import com.david.products.entity.Product;
import com.david.products.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository repository;

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product findbyId(long id) {
        Product p = repository.findById(id).get();
        return p;
    }

    public Product update(Product product, long id) {
        Product p = repository.findById(id).get();

        p.setName(p.getName());
        p.setQuantity(p.getQuantity());

        return repository.save(p);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public void delete(long id) {
        Product p = repository.findById(id).get();
        repository.delete(p);
    }
}
