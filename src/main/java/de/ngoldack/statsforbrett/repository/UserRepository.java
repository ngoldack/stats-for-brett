package de.ngoldack.statsforbrett.repository;


import de.ngoldack.statsforbrett.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
