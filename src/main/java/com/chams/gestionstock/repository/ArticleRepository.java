package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Integer, Article> {
}
