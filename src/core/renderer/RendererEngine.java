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
 * Creates a RendererEngine to use in a game of Fireboy and Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class RendererEngine {

    private Window window;
    private BufferStrategy buffer;
    private Graphics g;
    private ArrayList<Entity> entities;

    /**
     * Initializes the RendererEngine using a Window that the game will be
     * displayed in.
     *
     * @param window a Window representing a Window that the game will be
     * displayed in
     */
    public RendererEngine(Window window) {
        this.entities = new ArrayList<Entity>();
        this.window = window;
    }

    /**
     * 
     */
    public void draw() {
        this.buffer = this.window.getCanvas().getBufferStrategy();

        if (this.buffer == null) {
            this.window.getCanvas().createBufferStrategy(3);
            return;
        }

        this.g = this.buffer.getDrawGraphics();

        // clear the screen
        this.g.clearRect(0, 0, this.window.getWidth(), this.window.getHeight());

        this.g.setColor(Color.red);
        for (Entity entity : this.entities) {
            this.g.drawImage(entity.getPhoto().getImage(0), entity.getX(), entity.getY(), entity.getWidth(), entity.getHeight(), null);
        }

        this.buffer.show();
        this.g.dispose();

        this.entities.clear();
    }

    /**
     * Adds an Entity to the array list of entities in the RendererEngine.
     *
     * @param e an Entity representing an Entity to be added to the array list
     * of entities in the RendererEngine
     */
    public void addEntity(Entity e) {
        this.entities.add(e);
    }
}
