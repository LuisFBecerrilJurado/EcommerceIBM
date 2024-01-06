package com.example.Ecommerce.Products.model;

import com.example.Ecommerce.Users.model.Users;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import lombok.ToString;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@AllArgsConstructor
@Entity
@Table(name = "products")
@ToString

public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  private  String code;

  @Column(nullable = false)
  private String description;

  private BigDecimal price;

  @Column(nullable = false)
  private String image;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateCreated;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  private Date dateUpdate;

  @ManyToOne
  private Users users;

  public Product() {
    this.setCode(UUID.randomUUID().toString());
  }

}
