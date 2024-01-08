package com.example.Ecommerce.Products.service;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Users.model.Users;
import java.util.Optional;
import org.mapstruct.InheritInverseConfiguration;

public interface ProductService {
  Iterable<Product> getProducts();
  Iterable<Product> getProductsByUser(Users user);
  Optional<Product> getProductById(Integer id);
  Product saveProduct(Product product);
  void deleteProductById(Integer id);

}
