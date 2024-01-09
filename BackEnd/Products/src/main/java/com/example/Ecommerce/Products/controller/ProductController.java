package com.example.Ecommerce.Products.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductController {
  String create();
  String showProduct(Model model);
  String editProduct(@PathVariable Integer id, Model model);
  String deleteProduct(@PathVariable Integer id);
}
