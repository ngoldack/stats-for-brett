package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.ngoldack.statsforbrett.enums.BoardgameType;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class BoardgameDto extends GameDto {
    @NotNull
    @JsonProperty(value = "boardgame_type", required = true)
    private BoardgameType boardgameType;
}
