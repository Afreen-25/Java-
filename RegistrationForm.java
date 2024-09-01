import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RegistrationForm extends JFrame {
    private JTextField usernameField, emailField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    public RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        String[] labels = {"Username:", "Password:", "Email:"};
        JComponent[] components = {usernameField = new JTextField(),
                                   passwordField = new JPasswordField(),
                                   emailField = new JTextField()};

        for (int i = 0; i < labels.length; i++) {
            mainPanel.add(new JLabel(labels[i]));
            mainPanel.add(components[i]);
        }

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(this::registerUser);

        mainPanel.add(new JLabel()); // Placeholder for better alignment
        mainPanel.add(registerButton);

        messageLabel = new JLabel();
        mainPanel.add(messageLabel);

        add(mainPanel);
        setVisible(true);
    }

    private void registerUser(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String email = emailField.getText();

        // Perform registration logic here (e.g., validate input, save to a database, etc.)
        // For this example, we will just display the entered information
        messageLabel.setText("<html>Registration Successful!<br>Username: " + username + "<br>Password: " + password + "<br>Email: " + email + "</html>");

        // Clear the password field after registration
        passwordField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationForm::new);
    }
}
