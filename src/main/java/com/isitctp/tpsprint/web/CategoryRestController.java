package com.isitctp.tpsprint.web;

import com.isitctp.tpsprint.entity.Category;
import com.isitctp.tpsprint.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryRestController {
    CategoryRepository cr;
    public CategoryRestController(CategoryRepository cr) {
        this.cr = cr;
    }

    @GetMapping(path="")
    List<Category> getListCategories() {
        return cr.findAll();
    }

    @GetMapping(path="/delete")
    void deleteCategory(@RequestParam Long id) {
        cr.deleteById(id);
    }

    @PostMapping(path="")
    void addCategory(@RequestBody Category c) {
        cr.save(c);
    }

    @PutMapping(path = "")
    void updateCategory(@RequestParam Long id, @RequestBody Category x){
        Category c = cr.findById(id).get();
        c.setName(x.getName());
        cr.save(c);
    }

}
