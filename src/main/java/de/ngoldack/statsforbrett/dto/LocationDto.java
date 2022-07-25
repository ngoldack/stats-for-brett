package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty(value = "name", required = true)
    private String name;
}
