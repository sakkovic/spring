package com.example.demotestangular.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getArticle(){
        return articleRepository.findAll();
    }

    public void addNewArticle(Article article) {
        articleRepository.save(article);
    }

    public void deleteArticle(Long articleId) {
        boolean exists=articleRepository.existsById(articleId);
        if (!exists){
            throw new IllegalStateException("article with id "+ articleId +"does not exist");
        }
        articleRepository.deleteById(articleId);

    }
    @Transactional
    public void updateArticle(Long articleId, String depart, String destination, int place, LocalDate time) {
        Article article = articleRepository.findArticleById(articleId)
                .orElseThrow(() -> new IllegalStateException(
                        "article with id" + articleId + " does not exist"
                ));
        if (depart != null && depart.length() > 0 && !Objects.equals(article.getDepart(), depart)) {
            article.setDepart(depart);
        }
        if (destination != null && destination.length() > 0 && !Objects.equals(article.getDestination(), destination)) {
            article.setDestination(destination);
        }
        if (place != 0 && !Objects.equals(article.getPlaces(), place)) {
            article.setPlaces(place);
        }
        if (!Objects.equals(article.getTime(), time)) {
            article.setTime(time);
        }
    }
}
