package de.ngoldack.statsforbrett.repository;


import de.ngoldack.statsforbrett.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {
}
