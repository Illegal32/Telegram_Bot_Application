package az.iktlab.telegram_bot_application.dao.repository;

import az.iktlab.telegram_bot_application.dao.model.Role;
import az.iktlab.telegram_bot_application.dao.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(Roles name);
}
