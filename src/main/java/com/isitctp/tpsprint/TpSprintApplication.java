package com.isitctp.tpsprint;

import com.isitctp.tpsprint.entity.Category;
import com.isitctp.tpsprint.entity.Produit;
import com.isitctp.tpsprint.repository.CategoryRepository;
import com.isitctp.tpsprint.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TpSprintApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpSprintApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository pr, CategoryRepository cr) {

        return args -> {
            /*Category c1 = new Category(null,"category 1", null);
            Category c2 = new Category(null,"category 2", null);

            cr.save(c1);
            cr.save(c2);

            Produit p1 = new Produit(null, "dell", 1500.0,c1);
            Produit p2 = new Produit(null, "dell", 1500.0,c2);
            pr.save(p1);
            pr.save(p2);*/
            //pr.findAll().forEach(p -> System.out.println(p.toString()));
        };
    }

}
