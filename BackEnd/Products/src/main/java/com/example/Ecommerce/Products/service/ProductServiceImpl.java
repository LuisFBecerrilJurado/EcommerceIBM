package com.example.Ecommerce.Products.service;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Products.repository.ProductsRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class  ProductServiceImpl implements ProductService{

  @Autowired
  ProductsRepository productsRepository;

  @Override
  public Iterable<Product> getProducts() {
    return productsRepository.findAll();
  }


  @Override
  public Product getProductById(Integer id) {
    return ProductsRepository.mapProduct(productsRepository.findById(id).get());
  }

  @Override
  public Product saveProduct(Product product) {
    product.setDateCreated(LocalDateTime.now());
    product.setDateUpdate(LocalDateTime.now());
    return productsRepository.save(product);
  }

  @Override
  public void deleteProductById(Integer id) {

  }


}
