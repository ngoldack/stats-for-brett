package de.ngoldack.statsforbrett.repository;


import de.ngoldack.statsforbrett.models.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, String> {
}
