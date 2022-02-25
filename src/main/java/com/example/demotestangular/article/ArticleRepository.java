package com.example.demotestangular.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
    @Query("SELECT art from Article art where art.id= ?1")
    Optional<Article>findArticleById(Long id);

}
