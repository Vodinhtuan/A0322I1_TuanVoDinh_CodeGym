package com.example.demotest.controller;

import com.example.demotest.model.Bill;
import com.example.demotest.model.Product;
import com.example.demotest.model.ProductType;
import com.example.demotest.service.IBillService;
import com.example.demotest.service.IProductService;
import com.example.demotest.service.IProductTypeService;
//import com.example.demotest.validator.DateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/bill")
public class BillController {
    @Autowired
    private IBillService billService;
    @Autowired
    private IProductService productService;
    @Autowired
    private IProductTypeService productTypeService;

    @GetMapping("/list")
    public ModelAndView showList(Pageable pageable){
        return new ModelAndView("home", "bills", billService.findAll(pageable));
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("bill", new Bill());
        model.addAttribute("products", productService.listAll());
        model.addAttribute("productTypes", productTypeService.listAll());
        return "add-bill";

    }

    @PostMapping("/add")
    public String addBill(@Valid Bill bill, BindingResult result, Model model, ProductType productType, Product product){
        model.addAttribute("typeProducts", productTypeService.listAll());
        model.addAttribute("products", productService.listAll());
        if(result.hasErrors()){
            model.addAttribute("productTypes", productTypeService.listAll());
            return "add-bill";
        }else {
            billService.Save(bill);
        }
        return "redirect:/bill/list";
    }


    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        Bill bill = billService.findById(id);
        model.addAttribute("productType", productTypeService.listAll());
        model.addAttribute("product", productService.listAll());
        model.addAttribute("bill", bill);
        return "update-bill";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") long id, @Valid Bill bill, BindingResult result, Model model) {
        bill.setBillId((int) id);
        if (result.hasErrors()) {
            model.addAttribute("productType", productTypeService.listAll());
            model.addAttribute("product", productService.listAll());
            return "update-bill";
        }
        billService.Save(bill);
        return "redirect:/bill/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteBill(@PathVariable("id") Integer id){
        billService.delete(id);
        return "redirect:/bill/list";
    }
}
