package com.myinterface;

import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;

public class MyButton extends JButton implements MouseInputListener {

    public MyButton(String text) {
        super(text);

        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        System.out.println("My Event -> " + arg0);
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
}