package com.example.Ecommerce.Products.model;

import com.example.Ecommerce.Users.model.Users;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@AllArgsConstructor
@Table(name = "products")
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Product implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String code;
  private String description;
  private BigDecimal price;
  private String image;
  private LocalDateTime dateCreated;
  private LocalDateTime dateUpdate;
  @ManyToOne
  private Users users;

  public Product() {
    this.setCode(UUID.randomUUID().toString());
  }

}
