package com.example.Ecommerce.Products.service;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Users.model.Users;
import org.springframework.http.ResponseEntity;

public interface ProductService {
  public ResponseEntity<?> getProducts();
  public ResponseEntity<?> getProductsByUser(Users user);
  public ResponseEntity<?> getProductByName(String name);
  Product saveProduct(Product product);
  void deleteProductById(Long id);
}
