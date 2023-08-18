
package com.nsahin.kurs;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.nsahin.kurs.service.UserService;
import com.nsahin.kurs.controller.UserController;
import com.nsahin.kurs.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserControllerTest {

    private UserController userController;
    private UserService userService;

    @BeforeEach
    public void setup() {
        userService = mock(UserService.class);
        userController = new UserController(userService);
    }

    @Test
    public void testCreateUser() {
        // Mock userService.createUser method
        User user = new User("John Doe", "john.doe@example.com");
        when(userService.createUser(any(User.class))).thenReturn(user);

        // Test createUser method of UserController
        ResponseEntity<User> response = userController.createUser(user);

        // Verify the result
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(user, response.getBody());
    }

    @Test
    public void testGetUserById() {
        // Mock userService.getUserById method
        Long userId = 1L;
        User user = new User("John Doe", "john.doe@example.com");
        when(userService.getUserById(userId)).thenReturn(user);

        // Test getUserById method of UserController
        ResponseEntity<User> response = userController.getUserById(userId);

        // Verify the result
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(user, response.getBody());
    }

    @Test
    public void testGetAllUsers() {
        // Mock userService.getAllUsers method
        List<User> users = new ArrayList<>();
        users.add(new User("John Doe", "john.doe@example.com"));
        users.add(new User("Jane Smith", "jane.smith@example.com"));
        when(userService.getAllUsers()).thenReturn(users);

        // Test getAllUsers method of UserController
        ResponseEntity<List<User>> response = userController.getAllUsers();

        // Verify the result
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(users, response.getBody());
    }

    @Test
    public void testUpdateUser() {
        // Mock userService.updateUser method
        Long userId = 1L;
        User user = new User("John Doe", "john.doe@example.com");
        when(userService.updateUser(any(User.class))).thenReturn(user);

        // Test updateUser method of UserController
        ResponseEntity<User> response = userController.updateUser(userId, user);

        // Verify the result
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(user, response.getBody());
    }

    @Test
    public void testDeleteUser() {
        // Test deleteUser method of UserController
        Long userId = 1L;
        ResponseEntity<String> response = userController.deleteUser(userId);

        // Verify the result
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("User successfully deleted!", response.getBody());
    }
}
