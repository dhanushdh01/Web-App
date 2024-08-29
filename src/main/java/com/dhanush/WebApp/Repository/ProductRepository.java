package com.dhanush.WebApp.Repository;

import com.dhanush.WebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Optional<Product> findByProdName(String prodName);
    public List<Product>  findAllByCategory(String category);
}
