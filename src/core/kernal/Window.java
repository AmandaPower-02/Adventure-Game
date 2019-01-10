/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Amanda
 */
public class Window {

    private int width;
    private int height;

    private JFrame screen;
    private Canvas canvas;

    /**
     * initializes the data for where the game is displayed
     * @param title the name of the window
     * @param width the width of the window
     */
    public Window(String title, int width, int heigth) {

        screen = new JFrame(title);

        this.width = width;
        this.height = heigth;

        init();
    }

    /**
     * initialize the information of the window
     */
    private void init() {

        screen.setSize(new Dimension(width, height));
        screen.setResizable(false);
        screen.setLocationRelativeTo(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);

        canvas = new Canvas();

        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        screen.add(canvas);
        screen.pack();

    }

    /**
     * gets the canvas (where things are drawn)
     * @return canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * gets the width
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * gets the height
     * @return height
     */
    public int getHeight() {
        return height;
    }
}
