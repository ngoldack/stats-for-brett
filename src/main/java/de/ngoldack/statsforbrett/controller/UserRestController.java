package de.ngoldack.statsforbrett.controller;

import de.ngoldack.statsforbrett.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@RestController
@RequestMapping("user")
public class UserRestController {
    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<List<UserDto>> getUsers() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<Void> createUser(@RequestBody @Valid UserDto userDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<UserDto> getUserById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> updateUserById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteUserById(@PathVariable @NotEmpty String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
