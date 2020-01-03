package com.toyproject.api.triptogetherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Board {
    private final int id;
    private final String title;
    private final String content;

    public Board(@JsonProperty("id") int id,
                 @JsonProperty("title") String title,
                 @JsonProperty("content") String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
