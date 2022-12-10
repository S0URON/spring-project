package com.isitctp.tpsprint.repository;

import com.isitctp.tpsprint.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Produit, Long> {
    public List<Produit> findByNameContains(String query);

}
