package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class BoardgameMatchDto extends MatchDto {
    @JsonProperty(value = "extensions")
    private List<BoardgameDto> extensions;
}
