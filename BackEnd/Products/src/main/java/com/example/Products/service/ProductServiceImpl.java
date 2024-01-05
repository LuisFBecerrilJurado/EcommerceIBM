package com.example.Products.service;

import com.example.Products.model.Product;
import com.example.Products.model.User;
import com.example.Products.repository.ProductsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

  @Autowired
  ProductsRepository productsRepository;


  @Override
  public ResponseEntity<?> getProducts() {
    Iterable<Product> iterableProducts = productsRepository.findAll();
    List<Product> productList = new ArrayList<>((Collection) iterableProducts);
    if(!productList.isEmpty()){
      return ResponseEntity.status(HttpStatus.OK).body(productList);
    }else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sin Productos");
    }
  }

  @Override
  public ResponseEntity<?> getProductsByUser(User user) {
    return null;
  }

  @Override
  public ResponseEntity<?> getProductByName(String name) {
    Collection<Product> products = productsRepository.findLikeName(name);
    List<Product> productList = new ArrayList<>(products);
    return ResponseEntity.status(HttpStatus.OK).body(products);
  }


  @Override
  public Product saveProduct(Product product) {
    return null;
  }

  @Override
  public void deleteProductById(Long id) {

  }
}
