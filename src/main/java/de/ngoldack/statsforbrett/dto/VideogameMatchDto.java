package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.ngoldack.statsforbrett.enums.VideogamePlatform;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class VideogameMatchDto extends MatchDto {
    @JsonProperty("platform")
    private VideogamePlatform platform;
}
