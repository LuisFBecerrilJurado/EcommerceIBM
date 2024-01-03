package com.example.Products.repository;

import com.example.Products.model.Product;

public interface ProductsRepository {
  Iterable<Product> getProducts();
  Iterable<Product> getProductsByUser();

  Product getProductById(Long id);

  Product saveProduct(Product product);

  void deleteProductById(Long id);
}
