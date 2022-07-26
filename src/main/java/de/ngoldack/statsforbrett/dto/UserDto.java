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
    @JsonProperty(value = "user_type", required = true)
    private UserType userType;
    @JsonProperty("associated_guests")
    private List<UserDto> associatedGuests;
}
