package com.example.shop.product.service;

import com.example.shop.product.dto.ProductCreateRequest;
import com.example.shop.product.dto.ProductUpdateRequest;
import com.example.shop.product.entity.Product;
import com.example.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    @Transactional
    public Long createProduct(ProductCreateRequest request) {
        Product product = new Product(request.getName(), request.getPrice(), request.getStock());
        productRepository.save(product);
        return product.getId();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product getProductById(Long id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }
        return product;
    }

    @Override
    @Transactional
    public void updateProduct(Long id, ProductUpdateRequest request) {
        Product product = getProductById(id);
        product.updateInfo(request.getName(), request.getPrice(), request.getStock());
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        productRepository.deleteById(product.getId());
    }
}