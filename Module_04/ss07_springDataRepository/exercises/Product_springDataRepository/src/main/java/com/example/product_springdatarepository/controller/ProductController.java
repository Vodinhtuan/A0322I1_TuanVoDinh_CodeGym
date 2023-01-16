package com.example.product_springdatarepository.controller;

import com.example.product_springdatarepository.model.Product;
import com.example.product_springdatarepository.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService service;

    @GetMapping()
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "3") int page){
        Sort sort = Sort.by("name");
        model.addAttribute("products", service.findAll(PageRequest.of(page, 3, sort)));
        return "list";
    }

    @GetMapping("/create")
    public ModelAndView createProductPage(){
        return new ModelAndView("create", "product", new Product());
    }

}
