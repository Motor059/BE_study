package com.example.shop.product;

import com.example.shop.product.dto.ProductCreateRequest;
import com.example.shop.product.dto.ProductUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public Long createProduct(ProductCreateRequest request) {
        Product product = new Product(request.getName(), request.getPrice(), request.getStock());
        productRepository.save(product);
        return product.getId();
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Product getProductById(Long id) {
        Product product = productRepository.findById(id);

        if (product == null) {
            throw new RuntimeException("상품을 찾을 수 없습니다.");
        }

        return product;
    }

    @Transactional
    public void updateProduct(Long id, ProductUpdateRequest request) {
        Product product = getProductById(id);
        product.updateInfo(request.getName(), request.getPrice(), request.getStock());
    }

    @Transactional
    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        productRepository.deleteById(product.getId());
    }
}