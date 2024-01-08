package com.example.Ecommerce.Products.service;

import com.example.Ecommerce.Products.model.Product;

public interface ProductService {
  Iterable<Product> getProducts();
  Product getProductById(Integer id);
  Product saveProduct(Product product);
  void deleteProductById(Integer id);

}
