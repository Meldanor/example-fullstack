package de.meldanor.exampleapi.controller;

import de.meldanor.exampleapi.models.Article;
import de.meldanor.exampleapi.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    @GetMapping("/{text}")
    public List<Article> getByText(@PathVariable String text) {
        return repository.findFuzzyByText(text, Pageable.ofSize(2)).getContent();
    }

    @PostMapping
    public Article create(@RequestBody Map<String, Object> body) {
        Article article = new Article();
        article.setText(Objects.toString(body.get("text")));
        article.setTitle(Objects.toString(body.get("title")));
        return repository.save(article);
    }
}
