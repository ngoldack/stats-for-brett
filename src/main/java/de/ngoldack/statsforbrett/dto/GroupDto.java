package de.ngoldack.statsforbrett.dto;

import lombok.Data;

import java.util.List;

@Data
public class GroupDto {
    private String id;
    private String name;
    private List<UserDto> members;
    private List<EventDto> events;
}
