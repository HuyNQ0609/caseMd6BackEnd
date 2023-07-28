package com.example.casemd6backend.repository;

import com.casestudymodule6.model.question.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
