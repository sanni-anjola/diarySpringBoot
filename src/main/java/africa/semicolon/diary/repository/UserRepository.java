package africa.semicolon.diary.repository;

import africa.semicolon.diary.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findUserByUserName(String userName);
}
