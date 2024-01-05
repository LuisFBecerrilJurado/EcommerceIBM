package com.example.Products.service;

import com.example.Products.model.Product;
import com.example.Products.model.User;
import org.springframework.http.ResponseEntity;

public interface ProductService {
  public ResponseEntity<?> getProducts();
  public ResponseEntity<?> getProductsByUser(User user);
  public ResponseEntity<?> getProductByName(String name);
  Product saveProduct(Product product);
  void deleteProductById(Long id);
}
