package com.dhanush.WebApp.Controller;

import com.dhanush.WebApp.Model.Product;
import com.dhanush.WebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/products")
    public List<Product> getProduct() {
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return productService.getProductById(prodId);
    }

    @PostMapping("/products/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/products/update")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/delete/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        productService.deleteProduct(prodId);
    }

    @GetMapping("/products/price/{min}/{max}")
    public List<Product> getProductByPriceRange(@PathVariable int min, @PathVariable int max) {
        return productService.getProductByPriceRange(min, max);
    }

    @GetMapping("/product/{productName}")
    public Product getProductByBrand(@PathVariable String productName){
        return productService.getProductByBrand(productName); 
    }
    @GetMapping("/product/{searchproductName}")
    public Product searchProductByName(@PathVariable String productName){
        return productService.searchProductByName(productName); 
    }
    /*git 
    Features to be added:

    Clone the repository and add the following features to the project:
    1.  getProductByCategory
    2.  getProductByBrand
    3.  searchProductByName
    4.  getAvailableProducts
    5.  getProductsByPriceRange // By Dhanush

     */

}
