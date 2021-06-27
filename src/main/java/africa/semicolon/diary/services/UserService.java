package africa.semicolon.diary.services;

import africa.semicolon.diary.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    User save(User user);
    void deleteUserById(String id);
    List<User> getUsers();
    Optional<User> getUserById(String id);
    User findByUserName(String userName);

}
