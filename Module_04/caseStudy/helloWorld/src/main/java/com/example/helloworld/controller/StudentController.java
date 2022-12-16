package com.example.helloworld.controller;

import com.example.helloworld.dto.SearchSession;
import com.example.helloworld.model.Student;
import com.example.helloworld.service.ClassNameService;
import com.example.helloworld.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
@SessionAttributes("searchSession")
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    ClassNameService classNameService;

    @ModelAttribute("searchSession")
    public SearchSession setUpSearchSession() {
        return new SearchSession("");
    }

//    @GetMapping("/list")
//    public String getList(Model model){
//        model.addAttribute("students",studentService.getAll());
//        return "/student/list";
//    }
    @GetMapping("/list")
    public String getList(Pageable page,@ModelAttribute(name = "searchSession") SearchSession searchSession,
                          @RequestParam(required = false) String searchVal,
                          Model model) {

        if(searchVal != null) {
            searchSession.setValue(searchVal);
        }
        model.addAttribute("students", studentService.searchByNameOrEmail(page,searchSession.getValue()));
        return "/student/list";
    }

    @GetMapping("/create")
    public String CreateForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("classNames", classNameService.getAll());
        return "/student/create";
    }

    @PostMapping("/create")
    public String SaveStudent(@Valid  @ModelAttribute("student") Student student, BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
//            model.addAttribute("classNames", classNameService.getAll());
            return "/student/create";
       }
        studentService.create(student);
        return "redirect:/student/list";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("classNames", classNameService.getAll());
        return new ModelAndView("/student/edit", "student", studentService.findById(id));
    }

    @PostMapping("/edit/{id}")
    public String updateStudent(@PathVariable Integer id,@ModelAttribute Student student, Model model) {
        student.setId(id);
//        if(bindingResult.hasFieldErrors()) {
            model.addAttribute("classNames", classNameService.getAll());
//            return "/student/edit";
//        }
        studentService.update(student);
        return "redirect:/student/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        studentService.delete(id);
        return "redirect:/student/list";
    }
}
