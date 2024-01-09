package com.example.Ecommerce.Products.controller;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Products.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/products")
@Slf4j
public class ProductControlerImpl implements ProductController{

  @Autowired
  ProductService productService;

  @GetMapping("/create")
  public String create(){
    return "admin/products/create";
  }


  @PostMapping("/save-product")
  public String saveProduct(Product product){
    log.info("Nombre del Producto: {}", product);
    productService.saveProduct(product);
    //return "admin/products/create";
    return "redirect:/admin";
  }

  @GetMapping("/show")
  public String showProduct(Model model) {
    Iterable<Product> products = productService.getProducts();
    model.addAttribute("products",products);
    return "admin/products/show";
  }
}
