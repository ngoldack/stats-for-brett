package de.ngoldack.statsforbrett.repository;


import de.ngoldack.statsforbrett.models.VideogameMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameMatchRepository extends JpaRepository<VideogameMatch, String> {
}
