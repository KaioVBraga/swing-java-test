package com.myinterface;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Screen extends JPanel {

    JLabel nameLabel = new JLabel("Name: ");
    JTextField nameField = new JTextField(10);

    JLabel professionLabel = new JLabel("Profession: ");
    JTextField professionField = new JTextField(10);

    JButton submitButton = new JButton("Click here");

    public Screen() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(2, 2, 2, 2);

        add(nameLabel, gbc);

        gbc.gridx++;

        add(professionLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        add(nameField, gbc);

        gbc.gridx++;

        add(professionField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;

        submitButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.out.println("Submitting Data");
                System.out.println("Name: " + nameField.getText());
                System.out.println("Profession: " + professionField.getText());

                try {
                    PrintWriter out = new PrintWriter("filename.txt");
                    out.println("Name: " + nameField.getText());
                    out.println("Profession: " + professionField.getText());
                    out.close();

                } catch (FileNotFoundException e) {
                    System.out.println("Error not found file");
                }

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

        add(submitButton, gbc);

        gbc.gridx++;
        JButton myButton = new MyButton("My Button");

        add(myButton, gbc);

    }

}