package city.lostfound.core_service.user.core;

import city.lostfound.core_service.user.domain.entities.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();
}
