package de.ngoldack.statsforbrett.controller;

import de.ngoldack.statsforbrett.dto.LocationDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@RestController
@RequestMapping("location")
@Tag(name = "location", description = "queries around locations")
public class LocationRestController {
    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<List<LocationDto>> getLocations() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Void> createLocation(@RequestBody @Valid LocationDto locationDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<LocationDto> getLocationById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> updateLocationById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteLocationById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
