package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GroupDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty(value = "id", required = true)
    private String name;
    @JsonProperty("members")
    private List<UserDto> members;
    @JsonProperty("events")
    private List<EventDto> events;
}
