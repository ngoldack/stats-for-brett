package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EventDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty("players")
    private List<UserDto> players;
    @JsonProperty("matches")
    private List<MatchDto> matches;
}
