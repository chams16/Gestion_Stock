package com.chams.gestionstock.Service.Impl;

import com.chams.gestionstock.Service.ArticleService;
import com.chams.gestionstock.dto.ArticleDto;
import com.chams.gestionstock.exceptions.EntityNotFoundException;
import com.chams.gestionstock.exceptions.ErrorCodes;
import com.chams.gestionstock.exceptions.InvalidEntityException;
import com.chams.gestionstock.model.Article;
import com.chams.gestionstock.repository.ArticleRepository;
import com.chams.gestionstock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl (ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }

    @Override
    public ArticleDto save(ArticleDto dto) {
       List<String> errors = ArticleValidator.validate(dto);
       if(!errors.isEmpty()){
           log.error("Article is not valid {}", dto);
           throw new InvalidEntityException("l'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID,errors);

       }
       return ArticleDto.fromEntity(
               articleRepository.save(
                       ArticleDto.toEntity(dto)
               )
       );

    }

    @Override
    public ArticleDto findById(Integer id) {

        if(id==null){
            log.error("Article ID is null");
            return null;
        }
        Optional<Article> article = articleRepository.findById(id);

        ArticleDto dto = ArticleDto.fromEntity(article.get());

        return Optional.of(dto).orElseThrow(()-> new EntityNotFoundException(
                "Aucun article ave id =" + id + "n'est trouvee",ErrorCodes.ARTICLE_NOT_FOUND
        ));
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        if(codeArticle==null){
            log.error("Article Code is null");
            return null;
        }
        Optional<Article> article = articleRepository.findByCodeArticle(codeArticle);

        ArticleDto dto = ArticleDto.fromEntity(article.get());

        return Optional.of(dto).orElseThrow(()-> new EntityNotFoundException(
                "Aucun article avec codeArticle =" + codeArticle + "n'est trouvee",ErrorCodes.ARTICLE_NOT_FOUND
        ));
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll().stream()
                .map(ArticleDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
            if(id==null){
                log.error("Article ID is null");
            }
            articleRepository.deleteById(id);
    }
}
