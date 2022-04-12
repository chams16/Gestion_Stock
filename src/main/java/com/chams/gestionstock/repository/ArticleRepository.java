package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    Optional<Article> findByCodeArticle(String codeArticle);
}
