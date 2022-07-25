package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public abstract class GameDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty(value = "name", required = true)
    private String name;
    @JsonProperty(value = "publisher")
    private String publisher;
    @JsonProperty(value = "min_player_count")
    private int minPlayerCount;
    @JsonProperty(value = "max_player_count")
    private int maxPlayerCount;
    @JsonProperty(value = "avg_playtime")
    private int avgPlaytime;
    @JsonProperty(value = "poster_uri")
    private String posterUri;
}
