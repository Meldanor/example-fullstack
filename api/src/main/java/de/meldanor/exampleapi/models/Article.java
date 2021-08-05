package de.meldanor.exampleapi.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = "blog")
@Setting
@Getter
@Setter
public class Article {
    @Id
    private String id;
    private String title;
    @Field(analyzer = "german", type = FieldType.Text, searchAnalyzer = "german")
    private String text;
}
