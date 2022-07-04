package de.ngoldack.statsforbrett.controller;

import de.ngoldack.statsforbrett.dto.EventDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@RestController
@RequestMapping("event")
public class EventRestController {
    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<List<EventDto>> getEvents() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Void> createEvent(@RequestBody @Valid EventDto eventDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<EventDto> getEventById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> updateEventById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteEventById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
