package com.minimart.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minimart.model.Product;
import com.minimart.model.ProductRespository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private ProductRespository productRespository=null;
    
    @Autowired
    public ProductService(ProductRespository productRespository) {
    	this.productRespository= productRespository;
    }

    public List<Product> findAll() {
        return productRespository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRespository.findById(id);
    }

    public Product save(Product stock) {
        return productRespository.save(stock);
    }

    public void deleteById(Long id) {
        productRespository.deleteById(id);
    }
}