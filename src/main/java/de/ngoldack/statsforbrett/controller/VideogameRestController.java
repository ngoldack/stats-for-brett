package de.ngoldack.statsforbrett.controller;

import de.ngoldack.statsforbrett.dto.VideogameDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@RestController
@RequestMapping("videogame")
@Tag(name = "videogame", description = "queries around videogames")
public class VideogameRestController {
    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<List<VideogameDto>> getVideogames() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Void> createVideogame(@RequestBody @Valid VideogameDto videogameDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<VideogameDto> getVideogameById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> updateVideogameById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteVideogameById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
