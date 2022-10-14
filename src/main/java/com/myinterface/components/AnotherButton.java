package com.myinterface.components;

import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;
import java.util.EventListener;

public class AnotherButton extends JButton implements MouseListener {

    public AnotherButton(String text) {
        super(text);

        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        System.out.println("My Event -> " + arg0);
    }

}