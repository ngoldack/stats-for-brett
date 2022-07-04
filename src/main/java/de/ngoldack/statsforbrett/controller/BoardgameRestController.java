package de.ngoldack.statsforbrett.controller;

import de.ngoldack.statsforbrett.dto.BoardgameDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@RestController
@RequestMapping("boardgame")
public class BoardgameRestController {
    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<List<BoardgameDto>> getBoardgames() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Void> createBoardgame(@RequestBody @Valid BoardgameDto boardgameDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<BoardgameDto> getBoardgameById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> updateBoardgameById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteBoardgameById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
