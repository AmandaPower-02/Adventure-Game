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
 * Creates a new Window.
 * 
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Window {

    private final int width, height;
    private final JFrame screen;
    private Canvas canvas;

    /**
     * Initializes the data for where the game is displayed.
     *
     * @param title a String representing the name of the Window
     * @param width an integer representing the width of the Window
     * @param height an integer representing the height of the Window
     */
    public Window(String title, int width, int height) {
        this.screen = new JFrame(title);
        this.width = width;
        this.height = height;

        init();
    }

    /**
     * Initialize the information of the Window.
     */
    private void init() {
        this.screen.setSize(new Dimension(this.width, this.height));
        this.screen.setResizable(false);
        this.screen.setLocationRelativeTo(null);
        this.screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.screen.setVisible(true);

        this.canvas = new Canvas();

        this.canvas.setPreferredSize(new Dimension(this.width, this.height));
        this.canvas.setMaximumSize(new Dimension(this.width, this.height));
        this.canvas.setMinimumSize(new Dimension(this.width, this.height));

        this.screen.add(this.canvas);
        this.screen.pack();
    }

    /**
     * Gets the canvas (where things are drawn).
     *
     * @return a Canvas representing a canvas where things are drawn
     */
    public Canvas getCanvas() {
        return this.canvas;
    }

    /**
     * Returns the width of the Window.
     *
     * @return an integer representing the width of the Window
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Returns the height of the Window.
     *
     * @return an integer representing the height of the Window
     */
    public int getHeight() {
        return this.height;
    }
}
