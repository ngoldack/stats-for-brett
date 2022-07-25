package de.ngoldack.statsforbrett.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.ngoldack.statsforbrett.enums.VideogamePlatform;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class VideogameDto extends GameDto {
    @JsonProperty("available_platforms")
    private List<VideogamePlatform> availablePlatforms;
}
