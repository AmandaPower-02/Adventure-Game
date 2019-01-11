/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal.states;

import core.kernal.Input;
import core.kernal.Window;
import core.renderer.RendererEngine;
import core.renderer.SpriteSheet;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import modules.components.Collision;
import modules.components.Gravity;
import modules.components.Movement;
import modules.entities.Entity;

/**
 *
 * @author Amanda
 */
public class GameState extends State {

    private ArrayList<Entity> entities;

    private RendererEngine render;

    /**
     * initializes the data 
     * @param window the window that 
     */
    public GameState(Window window) {
        this.render = new RendererEngine(window);
        this.entities = new ArrayList<Entity>();
        this.entities.add(new Entity(10, 10, 100, 100, new SpriteSheet("index.jpg", 1), new Movement(), new Gravity(), new Collision()));
        this.entities.add(new Entity(100, 10, 100, 100, new SpriteSheet("index.jpg", 1), new Collision()));
      
    }

    /**
     * updates the information in the game
     */
    @Override
    public void update() {
        for (Entity entity : entities) {
           entity.update();
        }
    }

    /**
     * render the components that have to be drawn to the screen
     */
    @Override
    public void render() {
        for (Entity entity : entities) {
            render.addEntity(entity);
        }
        render.draw();
    }
}
