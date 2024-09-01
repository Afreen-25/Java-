import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwingExample extends JFrame {
    private JTextField nameField, streetField, cityField, pinCodeField;
    private JLabel infoLabel;

    public FirstSwingExample() {
        // Set up the main frame
        setTitle("User Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create and set layout for the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2, 10, 10));

        // Add labels and text fields
        mainPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        mainPanel.add(nameField);

        mainPanel.add(new JLabel("Street:"));
        streetField = new JTextField();
        mainPanel.add(streetField);

        mainPanel.add(new JLabel("City:"));
        cityField = new JTextField();
        mainPanel.add(cityField);

        mainPanel.add(new JLabel("Pin Code:"));
        pinCodeField = new JTextField();
        mainPanel.add(pinCodeField);

        // Create MyInfo button
        JButton myInfoButton = new JButton("MyInfo");
        myInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayInfo();
            }
        });

        // Add MyInfo button
        mainPanel.add(myInfoButton);

        // Create and add info label
        infoLabel = new JLabel();
        mainPanel.add(infoLabel);

        // Add the main panel to the frame
        add(mainPanel);

        // Set the frame visibility
        setVisible(true);
    }

    private void displayInfo() {
        String name = nameField.getText();
        String street = streetField.getText();
        String city = cityField.getText();
        String pinCode = pinCodeField.getText();

        // Set the font of the info label
        Font font = new Font("Arial", Font.ITALIC, 32);
        infoLabel.setFont(font);

        // Display information in the info label
        infoLabel.setText("<html>Name: " + name + "<br>Street: " + street + "<br>City: " + city + "<br>Pin Code: " + pinCode + "</html>");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstSwingExample();
            }
        });
    }
}
