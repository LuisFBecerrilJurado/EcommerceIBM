package com.example.Ecommerce.Products.repository;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Users.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Product,Long> {

  Iterable<Product> getProducts();
  Iterable<Product> getProductsByUser(Users user);
  Product getProductById(Integer id);
  Product saveProduct(Product product);
  void deleteProductById(Integer id);

}
