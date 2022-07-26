package de.ngoldack.statsforbrett.repository;


import de.ngoldack.statsforbrett.models.Boardgame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardgameMatchRepository extends JpaRepository<Boardgame, String> {
}
