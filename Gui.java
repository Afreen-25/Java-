import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Gui extends JFrame{
    private JTextField usernameField, emailField;
    private JPasswordField passwordField;
    

    public Gui(){
        setTitle("my form");// for frame
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p= new JPanel(new GridLayout(4, 2, 10, 10));
        JLabel usernameLabel= new JLabel("username");
        JLabel emailLabel= new JLabel("email");
        JLabel passwordLabel= new JLabel("password");

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        emailField = new JTextField();

        JButton b= new JButton("register");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String username= usernameField.getText();
                String password = new String(passwordField.getPassword());
                String email = emailField.getText();

                System.out.println("registration successful");
                JOptionPane.showMessageDialog(null, "Registration Successful!");

            }
            
        });
        
        p.add(usernameLabel);
        p.add(usernameField);
        p.add(passwordLabel);
        p.add(passwordField);
        p.add(emailLabel);
        p.add(emailField);
        p.add(new JLabel());
        // Placeholder for better alignment
        p.add(b);

        add(p);
        setVisible(true);

    }

    public static void main(String[] args) {
       new Gui();
    }
}

