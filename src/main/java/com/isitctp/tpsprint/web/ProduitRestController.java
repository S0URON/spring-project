package com.isitctp.tpsprint.web;

import com.isitctp.tpsprint.entity.Produit;
import com.isitctp.tpsprint.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitRestController {
    ProductRepository pr;
    public ProduitRestController(ProductRepository pr) {
        this.pr = pr;
    }

    @GetMapping(path="/produits")
    List<Produit> getListProducts() {
        return pr.findAll();
    }

    @GetMapping(path="/delete")
    void deleteProducts(@RequestParam Long id) {
        pr.deleteById(id);
    }

    @PostMapping(path="/produits")
    void addProduct(@RequestBody Produit p) {
        pr.save(p);
    }

    @PutMapping(path = "/produits")
    void updateProduct(@RequestParam Long id, @RequestBody Produit x){
        Produit p = pr.findById(id).get();
        p.setName(x.getName());
        p.setPrice(x.getPrice());
        pr.save(p);
    }

}
