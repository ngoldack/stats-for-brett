package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
public abstract class MatchDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty(value = "game", required = true)
    private GameDto game;
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty(value = "users", required = true)
    private List<UserDto> users;
    @JsonProperty(value = "start_time", required = true)
    private LocalDateTime startTime;
    @JsonProperty("end_time")
    private LocalDateTime endTime;
    @JsonProperty("scoreboard")
    private Map<Integer, Map<UserDto, Double>> scoreboard;
}
