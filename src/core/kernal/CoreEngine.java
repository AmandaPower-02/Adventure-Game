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
 *
 * @author Amanda
 */
public class CoreEngine implements Runnable {

    private Window window;
    private Thread thread;
    private boolean running = false;
    
    private GameState gameState;

    public void initialize(String title, int width) {

        window = new Window(title, width);
        gameState = new GameState (window) ;
        State.setState(gameState);

    }

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

    private void update() {
        
        Input.getInstance().update();
        
        if(State.getState()!= null){
            State.getState().update();
        }

    }

    private void render() {
        
        if (State.getState()!=null){
            State.getState().render();
        }

    }

    public synchronized void start() {

        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {

        if (!running) {
            return;
        }

        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CoreEngine.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
