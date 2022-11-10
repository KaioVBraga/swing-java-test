package com.myinterface.screens;

import javax.swing.*;
import javax.swing.event.*;

import com.myinterface.components.MyButton;
import com.myinterface.entities.User;
import com.myinterface.models.UserModel;
import com.myinterface.services.UserService;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Screen extends JPanel {

    JLabel nameLabel = new JLabel("Name: ");
    JTextField nameField = new JTextField(32);

    JLabel userNameLabel = new JLabel("UserName: ");
    JTextField userNameField = new JTextField(32);

    JLabel emailLabel = new JLabel("Email: ");
    JTextField emailField = new JTextField(32);

    JLabel passwordLabel = new JLabel("Password: ");
    JPasswordField passwordField = new JPasswordField(32);

    JButton submitButton = new JButton("Click here");

    public Screen() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(4, 4, 4, 4);

        add(nameLabel, gbc);

        gbc.gridy++;
        add(nameField, gbc);

        gbc.gridy++;
        add(userNameLabel, gbc);

        gbc.gridy++;
        add(userNameField, gbc);

        gbc.gridy++;
        add(emailLabel, gbc);

        gbc.gridy++;
        add(emailField, gbc);

        gbc.gridy++;
        add(passwordLabel, gbc);

        gbc.gridy++;
        add(passwordField, gbc);
        submitButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.out.println("Submitting Data");
                System.out.println("Name: " + nameField.getText());
                System.out.println("UserName: " + userNameField.getText());
                System.out.println("Email: " + emailField.getText());
                System.out.println("Password: " + passwordField.getText());

                User user = new User(
                        nameField.getText(),
                        userNameField.getText(),
                        emailField.getText(),
                        passwordField.getText());

                UserService.create(user);

                User otherUser = UserModel.findOne(1L);

                System.out.println("OTHER USER -> " + otherUser);

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseDragged(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseMoved(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }
        });

        gbc.gridy++;
        add(submitButton, gbc);

    }

}