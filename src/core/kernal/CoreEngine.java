/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal;

import core.kernal.states.GameState;
import core.kernal.states.State;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CoreEngine of Fireboy and Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class CoreEngine implements Runnable {

    private Window window;
    private Thread thread;
    private boolean running = false;
    private GameState gameState;

    /**
     * Sets the size of the Window, and the state that the Window is in.
     *
     * @param title a String representing the name of the Window
     * @param width an integer representing the width of the Window
     * @param height an integer representing the height of the Window
     */
    public void initialize(String title, int width, int height) {
        this.window = new Window(title, width, height);
        this.gameState = new GameState(this.window);
        State.setState(this.gameState);
    }

    /**
     * Runs the game.
     */
    @Override
    public void run() {
        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double tickFrequency = 0;
        double currentTime;
        double lastTime = System.nanoTime();

        long timer = 0;
        long ticks = 0;
        System.out.println("stat");

        while (running) {
            currentTime = System.nanoTime();
            tickFrequency += (currentTime - lastTime) / timePerTick;

            timer += currentTime - lastTime;

            lastTime = currentTime;

            if (tickFrequency >= 1) {

                update();
                render();
                tickFrequency--;
                ticks++;
            }

            if (timer >= 1000000000) {
                System.out.println("fps: " + ticks);
                timer = 0;
                ticks = 0;
            }
        }

        stop();
    }

    /**
     * Updates the game.
     */
    private void update() {
        Input.getInstance().update();

        if (State.getState() != null) {
            State.getState().update();
        }
    }

    /**
     * Renders the objects in the game.
     */
    private void render() {
        if (State.getState() != null) {
            State.getState().render();
        }
    }

    /**
     * Starts the game.
     */
    public synchronized void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        this.thread = new Thread(this);
        this.thread.start();
    }

    /**
     * Stops the game when not running.
     */
    public synchronized void stop() {
        if (!this.running) {
            return;
        }

        this.running = false;
        try {
            this.thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CoreEngine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
