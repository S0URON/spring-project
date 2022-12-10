package com.isitctp.tpsprint.web;


import com.isitctp.tpsprint.repository.CategoryRepository;
import com.isitctp.tpsprint.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProduitController {
    ProductRepository pr;
    CategoryRepository cr;

    public ProduitController(ProductRepository pr, CategoryRepository cr){
        this.pr = pr;
        this.cr = cr;
    }


    @GetMapping("/products")
    public String getListProducts(Model m){
        m.addAttribute("liste", pr.findAll());
        m.addAttribute("categorie", cr.findAll());
        return "index";
    }
}
