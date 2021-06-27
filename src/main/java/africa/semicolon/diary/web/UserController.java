package africa.semicolon.diary.web;

import africa.semicolon.diary.models.User;
import africa.semicolon.diary.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user/{userName}/{password}")
    public User createUser(@PathVariable ("userName") String user, @PathVariable("password") String password){
        User user1 = new User();
        user1.setUserName(user);
        user1.setPassword(password);
       return userService.save(user1);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUserById(id);
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @GetMapping("/user/user/{userName}")
    public User getUserByUserName(@PathVariable ("userName") String userName){
        return userService.findByUserName(userName);
    }

}
