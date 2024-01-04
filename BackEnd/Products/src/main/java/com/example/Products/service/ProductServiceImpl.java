package com.example.Products.service;

import com.example.Products.model.Product;
import com.example.Products.model.User;
import com.example.Products.repository.ProductsRepository;


public class ProductServiceImpl{

  private final ProductsRepository productsRepository;

  public ProductServiceImpl(ProductsRepository productsRepository){
    this.productsRepository = productsRepository;
  }

  public Iterable<Product> getProducts() {
    return productsRepository.getProducts();
  }

  public Iterable<Product> getProductsByUser(User user) {
    return productsRepository.getProductsByUser(user);
  }


  public Product getProductById(Long id) {
    return productsRepository.getProductById(id);
  }


  public Product saveProduct(Product product) {
    return productsRepository.saveProduct(product);
  }


  public void deleteProductById(Long id) {
    productsRepository.deleteProductById(id);
  }
}
