package com.isitctp.tpsprint.web;


import com.isitctp.tpsprint.entity.Produit;
import com.isitctp.tpsprint.repository.CategoryRepository;
import com.isitctp.tpsprint.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProduitController {
    ProductRepository pr;
    CategoryRepository cr;

    public ProduitController(ProductRepository pr, CategoryRepository cr){
        this.pr = pr;
        this.cr = cr;
    }

    @GetMapping("/edit-products")
    public String getEditProductPage(@RequestParam Long id, Model m){
        Optional<Produit> x = pr.findById(id);
        if(x.isPresent()) {
            Produit p = x.get();
            m.addAttribute("produit", p);
        }
        m.addAttribute("categorie", cr.findAll());
        return "edit";
    }

    @GetMapping("/products")
    public String getListProducts(Model m){
        m.addAttribute("liste", pr.findAll());
        m.addAttribute("categorie", cr.findAll());
        return "index";
    }

    @GetMapping("/delete-product")
    public String deleteProduct(@RequestParam Long id, Model m){
        pr.deleteById(id);
        m.addAttribute("liste", pr.findAll());
        m.addAttribute("categorie", cr.findAll());
        return "index";
    }

    @PostMapping("/add-product")
    public String addProduct(Model m, Produit body){
        pr.save(body);
        m.addAttribute("liste", pr.findAll());
        m.addAttribute("categorie", cr.findAll());
        return "index";
    }

    @PostMapping("/edit-product")
    public String editProduct(@RequestParam Long id, Model m, Produit body){
        Produit p = pr.findById(id).get();
        p.setName(body.getName());
        p.setPrice(body.getPrice());
        pr.save(p);
        m.addAttribute("liste", pr.findAll());
        m.addAttribute("categorie", cr.findAll());
        return "index";
    }
}
