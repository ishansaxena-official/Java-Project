import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String registerUser(User user) {
        // Logic for user registration
        return "User registered successfully!";
    }

    public String authenticateUser(User user) {
        // Logic for user authentication
        return "Authentication successful!";
    }
}
