package com.example.Ecommerce.Products.controller;

import org.springframework.ui.Model;

public interface ProductController {
  String create();

  String showProduct(Model model);
}
