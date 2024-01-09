package com.example.Ecommerce.directionsController;

import com.example.Ecommerce.Products.model.Product;
import com.example.Ecommerce.Products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
  @Autowired
  ProductService productService;

  @GetMapping
  public String homeAdmin(Model model){
    Iterable<Product> products = productService.getProducts();
    model.addAttribute("products",products);
    return "admin/home";
  }
}
