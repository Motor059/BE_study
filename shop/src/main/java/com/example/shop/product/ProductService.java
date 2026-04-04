package com.example.shop.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    // 구체적인 논리 작성은 다음에,,
    public Long createProduct(ProductCreateRequest request) {
        return 1L;
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    public Product getProductById(Long id) {
        return new Product();
    }

    public void updateProduct(Long id, ProductUpdateRequest request) {

    }

    public void deleteProduct(Long id) {

    }
}