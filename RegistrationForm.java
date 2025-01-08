import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm {

    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;

    public RegistrationForm() {
        frame = new JFrame("User Registration");
        frame.setSize(300, 200);

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                // Register user logic
            }
        });

        frame.add(nameField);
        frame.add(emailField);
        frame.add(passwordField);
        frame.add(registerButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
// Error handling for empty fields in the RegistrationForm
if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
    JOptionPane.showMessageDialog(frame, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
} else {
    // Proceed with registration logic
}
// Event handling code is already included in the `ActionListener` for the registerButton in the `RegistrationForm.java`.
