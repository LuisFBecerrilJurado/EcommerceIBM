package com.example.Ecommerce.Products.service;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Products.repository.ProductsRepository;
import com.example.Ecommerce.Users.model.Users;
import java.util.Optional;
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
  public Iterable<Product> getProductsByUser(Users user) {
    return ProductsRepository.mapProducts(productsRepository.findByUser());

    return productMapper.toProducts(productCrudRepository.findByUserEntity(userMapper.toUserEntity(user)) );
  }

  @Override
  public Optional<Product> getProductById(Integer id) {
    return productsRepository.findById(id);
  }

  @Override
  public Product saveProduct(Product product) {
    return null;
  }

  @Override
  public void deleteProductById(Integer id) {

  }


}
