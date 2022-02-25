package com.example.demotestangular.article;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
@Slf4j
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api/v1/")
public class ArticleController {
    private final ArticleService articleService;
    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping(path = "/articles")
    public List<Article> getArticle(){return articleService.getArticle();}

    @PostMapping("/articles")
    public void registerNewArticle(@RequestBody Article article){
        articleService.addNewArticle(article);
    }


    @DeleteMapping(path = "/articles/{articleId}")
    public void deleteArticle(@PathVariable("articleId")Long articleId){

        articleService.deleteArticle(articleId);
    }

    @Transactional
    @PutMapping(path = "/articles/{articleId}")
    public void updateArticle(
            @PathVariable("articleId")Long articleId,
           @RequestBody Article article

    ){

        articleService.updateArticle(articleId,article.getDepart(),article.getDestination(),article.getPlaces(),article.getTime());

    }
}
