package com.example.shop.product.repository;

import com.example.shop.product.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class JpaProductRepository implements ProductRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Product findById(Long id) {
        return em.find(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

    @Override
    public void save(Product product) {
        em.persist(product);
    }

    @Override
    public void deleteById(Long id) {
        Product product = em.find(Product.class, id);
        if (product != null) {
            em.remove(product);
        }
    }
}