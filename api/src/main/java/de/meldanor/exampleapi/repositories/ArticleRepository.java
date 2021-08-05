package de.meldanor.exampleapi.repositories;

import de.meldanor.exampleapi.models.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Query("{\"multi_match\": {\"query\": \"?0\", \"fields\": [\"text\"], \"fuzziness\": \"AUTO\"}}")
    Page<Article> findFuzzyByText(String text, Pageable pageable);
}

