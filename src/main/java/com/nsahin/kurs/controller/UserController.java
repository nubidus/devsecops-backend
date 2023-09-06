package com.nsahin.kurs.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.nsahin.kurs.service.UserService;
import com.nsahin.kurs.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*; 


@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    String input = "User1:pass123, User2:password456, User3:secret@789";

        // Define the regular expression pattern for matching usernames and passwords
    Pattern pattern = Pattern.compile("([a-zA-Z0-9_]+):([a-zA-Z0-9_]+)");

        // Create a Matcher object to find matches in the input string
    Matcher matcher = pattern.matcher(input);

        // Find and print all matches
    while (matcher.find()) {
            String username = matcher.group(1);
            String password = matcher.group(2);
            System.out.println("Username: " + username + ", Password: " + password);

    // build create User REST API
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/users/1
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("/users/{id}")
    // http://localhost:8080/api/users/1
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody User user){
        user.setId(userId);
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
    class Foo {
	final String pwd = "password";	
 	void main()	{
		foo(pwd);
	}

    void diff_word() {
        foo("hello");
    }
    void diff_func() {
        bar("password");
    }

    void same_const() {
        foo("password");
    }

    void all_diff() {
        bar("hello");
    }
}

}
