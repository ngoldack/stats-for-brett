package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BoardgameMatchDto {
    @JsonProperty(value = "extensions")
    private List<BoardgameDto> extensions;
}
