package com.example.Products.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@AllArgsConstructor
@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)

public class Product implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String code;

  @Column(nullable = false)
  private String description;

  private BigDecimal price;

  @Column(nullable = false)
  private String img;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateCreated;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  private Date dateUpdate;

}
