/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.renderer;

import core.kernal.Window;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import modules.entities.Entity;

/**
 *
 * @author Amanda
 */
public class RendererEngine {

    private Window window;
    private BufferStrategy buffer;
    private Graphics g;

    private ArrayList<Entity> entities;

    /**
     * initializes render data
     * @param window the window that things will be rendered to
     */
    public RendererEngine(Window window) {

        entities = new ArrayList<Entity>();

        this.window = window;

    }

    /**
     * allow entities to be drawn to the screen
     */
    public void draw() {

        buffer = window.getCanvas().getBufferStrategy();

        if (buffer == null) {
            window.getCanvas().createBufferStrategy(3);
            return;
        }

        g = buffer.getDrawGraphics();

        g.clearRect(0, 0, window.getWidth(), window.getHeight());

        g.setColor(Color.red);
        for (Entity entity : entities) {
            g.drawImage(entity.getPhoto().getImage(0), entity.getX(), entity.getY(), entity.getWidth(), entity.getHeight(), null);
        }

        buffer.show();
        g.dispose();

        entities.clear();

    }

    /**
     * adds an entity
     * @param e entity
     */
    public void addEntity(Entity e) {

        entities.add(e);

    }

}
