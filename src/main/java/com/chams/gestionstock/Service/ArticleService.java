package com.chams.gestionstock.Service;

import com.chams.gestionstock.dto.ArticleDto;

import java.util.List;

public interface ArticleService {

    public ArticleDto save(ArticleDto dto);

    public ArticleDto findById(Integer id);

    public ArticleDto findByCodeArticle(String codeArticle);

    public List<ArticleDto> findAll();

    public void delete(Integer id);
}
