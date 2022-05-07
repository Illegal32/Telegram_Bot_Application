package az.iktlab.telegram_bot_application.dao.repository;

import az.iktlab.telegram_bot_application.dao.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);

    Boolean existsByUsername(String username);
}