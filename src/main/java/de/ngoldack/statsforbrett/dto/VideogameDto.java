package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.ngoldack.statsforbrett.enums.VideogamePlatform;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VideogameDto {
    @JsonProperty("platform")
    private VideogamePlatform platform;
}
