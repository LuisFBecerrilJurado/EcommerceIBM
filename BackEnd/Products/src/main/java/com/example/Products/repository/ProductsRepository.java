package com.example.Products.repository;

import com.example.Products.model.Product;
import com.example.Products.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository {
  Iterable<Product> getProducts();
  Iterable<Product> getProductsByUser(User user);
  Product getProductById(Long id);
  Product saveProduct(Product product);
  void deleteProductById(Long id);

}
