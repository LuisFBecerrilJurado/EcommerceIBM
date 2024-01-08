package com.example.Ecommerce.Products.repository;

import com.example.Ecommerce.Products.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Product,Integer>{
  @Query("SELECT p FROM Product p WHERE p.name like %?1%")
  Collection<Product> findLikeName (String name);

  public static Iterable<Product> mapProducts(Iterable<Product> product) {
    if ( product == null ) {
      return null;
    }

    ArrayList<Product> iterable = new ArrayList<Product>();
    for ( Product products : product ) {
      iterable.add( mapProduct( products ) );
    }

    return iterable;
  }

  public static Product mapProduct(Product product) {
    if ( product == null ) {
      return null;
    }

    Product products = new Product();
    products.setId( product.getId() );
    products.setName( product.getName() );
    products.setDescription( product.getDescription() );
    products.setPrice( product.getPrice() );
    products.setDateCreated( product.getDateCreated() );
    products.setDateUpdate( product.getDateUpdate() );
    products.setCode( product.getCode() );
    products.setImage( product.getImage() );
    return products;
  }
}
