package com.example.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
