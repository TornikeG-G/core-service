package city.lostfound.core_service.user.repository;

import city.lostfound.core_service.user.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
