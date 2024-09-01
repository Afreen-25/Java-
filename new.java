import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class new{
    JFrame f= new JFrame("user info");
    JTextField nameField,streetField,cityField,pinField;
    JLabel infoLabel;

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

        JButton b= new JButton("my info");
        b.addActionListener(new ActionListener(){
           public void action(ActionEvent e){
            displayInfo();

           }

        });
        mainPanel.add(b);
        infoLabel=new JLabel();
        mainPanel.add(infoLabel);

        add(mainPanel);
        setVisible(true);
        



}