package com.isitctp.tpsprint.repository;

import com.isitctp.tpsprint.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
