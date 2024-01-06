package com.example.Ecommerce.Products.service;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Products.repository.ProductsRepository;
import com.example.Ecommerce.Users.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class  ProductServiceImpl implements ProductService{

  @Autowired
  ProductsRepository productsRepository;

  @Override
  public Iterable<Product> getProducts() {
    return productsRepository.getProducts();
  }

  @Override
  public Iterable<Product> getProductsByUser(Users user) {
    return productsRepository.getProductsByUser(user);
  }

  @Override
  public Product getProductById(Integer id) {
    return productsRepository.getProductById(id);
  }

  @Override
  public Product saveProduct(Product product) {
    return productsRepository.saveProduct(product);
  }

  @Override
  public void deleteProductById(Integer id) {
    productsRepository.deleteProductById(id);
  }
}
