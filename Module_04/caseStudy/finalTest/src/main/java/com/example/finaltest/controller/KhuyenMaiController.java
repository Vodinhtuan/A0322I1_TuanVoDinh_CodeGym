package com.example.finaltest.controller;

import com.example.finaltest.model.KhuyenMai;
import com.example.finaltest.service.IKhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("khuyenmai")
public class KhuyenMaiController {
    @Autowired
    private IKhuyenMaiService service;

    /*@GetMapping("/list")
    public ModelAndView showList(){
        return new ModelAndView("home", "khuyenmais", service.findAll());
    }*/

    @GetMapping("/list")
    public String home(Model model, @RequestParam(value = "keyword", defaultValue = "") String keyword){
        model.addAttribute("khuyenmais", service.getByKeyword(keyword));
        return "home";
    }

    @GetMapping("create")
    public String showFormCreate(Model model) {
        model.addAttribute("khuyenmai", new KhuyenMai());
        return "add-khuyenmai";
    }

    @PostMapping("add")
    public String addBill(@Valid @ModelAttribute(value = "khuyenmai") KhuyenMai khuyenMai, BindingResult result) {
        if (result.hasErrors()) {
            return "add-khuyenmai";
        } else {
            service.Save(khuyenMai);
            return "redirect:/khuyenmai/list";
        }
    }


    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return "redirect:/khuyenmai/list";
    }

}
