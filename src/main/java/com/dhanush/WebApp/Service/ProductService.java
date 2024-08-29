package com.dhanush.WebApp.Service;

import com.dhanush.WebApp.Model.Product;
import com.dhanush.WebApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;

//    List<Product> products  = new ArrayList<>(Arrays.asList(
//            new Product(1, "Laptop", 45000),
//            new Product(2, "Mobile", 15000),
//            new Product(3, "Tablet", 20000)
//    ));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    public List<Product> getProductByPriceRange(int min, int max) {
        List<Product> products = new ArrayList<>();
        for (Product product : repo.findAll()) {
            if (product.getPrice() >= min && product.getPrice() <= max) {
                products.add(product);
            }
        }
        return products;
    }

    public Product getProductByName(String productName){
        return repo.findByProdName(productName).get();
    }
    public List<Product> getProductsBYCategory(String category) {
           List<Product> products = repo.findAllByCategory(category);
            if(products.isEmpty())
                throw new RuntimeException("There is no Product categorized with this " + category);
            return products;
    }
}
