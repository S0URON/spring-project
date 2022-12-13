package com.isitctp.tpsprint.web;

import com.isitctp.tpsprint.entity.Category;
import com.isitctp.tpsprint.repository.CategoryRepository;
import com.isitctp.tpsprint.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {
    @Autowired
    ProductRepository pr;
    @Autowired
    CategoryRepository cr;

    @PostMapping("/add-category")
    public String addCategory(Model m, Category body){
        cr.save(body);
        m.addAttribute("liste", cr.findAll());
        return "test";
    }

    @GetMapping("/category-list")
    public String getListCategory(Model m){
        m.addAttribute("liste", cr.findAll());
        return "test";
    }

    @GetMapping("/delete-category")
    public String deleteProduct(@RequestParam Long id, Model m){
        cr.deleteById(id);
        m.addAttribute("liste", cr.findAll());
        return "test";
    }

}
