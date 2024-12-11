package com.xworks.products.controller;


import com.xworks.products.DTO.ProductDTO;
import com.xworks.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductsController {
    @Autowired
    private ProductService productService;

    public ProductsController() {
        System.out.println("created ProductsController");
    }

    @PostMapping("/SaveProduct")
    public String pro(ProductDTO productDTO, Model model) {
        System.out.println(productDTO.toString());

        if (productService.service(productDTO)) {
            System.out.println("successfully saved");
            model.addAttribute("message","Product is successfully order");
            model.addAttribute("productsDTO",productDTO);
            return "ProductsSuccess.jsp";
        }      else {
            model.addAttribute("failure","error while ordering a product");


        }

        return "Products.jsp";
    }



}