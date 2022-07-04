package de.ngoldack.statsforbrett.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import de.ngoldack.statsforbrett.enums.UserType;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
public class UserDto {
    @JsonProperty("id")
    private String id;
    @NotEmpty
    @JsonProperty(value = "username", required = true)
    private String username;
    @NotEmpty
    @JsonProperty(value = "email", required = true)
    private String email;
    @JsonProperty
    private UserType userType;
    @JsonProperty
    private List<UserDto> associatedGuests;
}
