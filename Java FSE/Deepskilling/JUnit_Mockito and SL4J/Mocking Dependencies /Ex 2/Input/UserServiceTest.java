package com.example.demo.service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserService userService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize @Mock and @InjectMocks
    }
    @Test
    public void testGetUserById_UserExists() {
        Long userId = 1L;
        User mockUser = new User();
        mockUser.setId(userId);
        mockUser.setName("Alice");
        when(userRepository.findById(userId)).thenReturn(Optional.of(mockUser));

        User result = userService.getUserById(userId);
        assertNotNull(result);
        assertEquals("Alice", result.getName());
        assertEquals(userId, result.getId());
    }
    @Test
    public void testGetUserById_UserDoesNotExist() {
        Long userId = 2L;
        when(userRepository.findById(userId)).thenReturn(Optional.empty());
        User result = userService.getUserById(userId);
        assertNull(result);
    }
}
