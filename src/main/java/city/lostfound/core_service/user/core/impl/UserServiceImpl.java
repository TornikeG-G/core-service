package city.lostfound.core_service.user.core.impl;

import city.lostfound.core_service.user.core.UserService;
import city.lostfound.core_service.user.domain.entities.User;
import city.lostfound.core_service.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}

