package com.example.Products.repository;

import com.example.Products.model.Product;
import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Product,Long> {

  @Query("SELECT p FROM Product p WHERE p.name like %?1%")
  Collection<Product> findLikeName (String name);
}
