package com.example.Ecommerce.Products.service;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Users.model.Users;
import org.springframework.http.ResponseEntity;

public interface ProductService {
  public Iterable<Product> getProducts();
  public Iterable<Product> getProductsByUser(Users user);
  Product getProductById(Integer id);
  Product saveProduct(Product product);
  void deleteProductById(Integer id);
}
