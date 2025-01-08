import java.util.Scanner;

public class UserRegistrationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Register user logic
        System.out.println("User " + name + " registered successfully!");
    }
}
// Error handling in console-based application
try {
    if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
        throw new IllegalArgumentException("All fields are required!");
    }
    // Logic for registering the user
} catch (IllegalArgumentException e) {
    System.out.println("Error: " + e.getMessage());
}
