package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
}
