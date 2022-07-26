package de.ngoldack.statsforbrett.repository;


import de.ngoldack.statsforbrett.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, String> {
}
