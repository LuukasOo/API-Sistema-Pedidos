package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
