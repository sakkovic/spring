package com.example.demotestangular.article;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class ArticleConfig {
    @Bean
    CommandLineRunner commandLineRunner(ArticleRepository repository){
        return args -> {
           /* Article artc1 = new Article(
                    "Tunis",
                    "Monastir",
                    1,
                    LocalDate.of(2022,AUGUST,20)
            );
            repository.saveAll(
                    List.of(artc1)
            );*/

        };
    }

}
