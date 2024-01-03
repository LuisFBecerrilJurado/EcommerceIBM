package com.example.Products.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
  private Long id;
  private String name;
  private String code;
  private String description;
  private BigDecimal price;
  private String img;
  private LocalDateTime dateCreated;
  private LocalDateTime dateUpdate;

  public Product(){
    this.setCode(UUID.randomUUID().toString());
  }
}
