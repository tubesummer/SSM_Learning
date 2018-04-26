package com.how2java.controller;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView modelAndView = new ModelAndView();
        List<Category> cs = categoryService.list();
        modelAndView.addObject("cs",cs);
        modelAndView.setViewName("listCategory");
        return modelAndView;
    }

}
