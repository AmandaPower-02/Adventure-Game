/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal.states;

import core.kernal.Window;
import core.renderer.RendererEngine;
import java.util.ArrayList;
import modules.entities.Entity;

/**
 *
 * @author powea5594
 */
public class SelectionState extends State {

    private ArrayList<Entity> entities;

    private RendererEngine render;

    /**
     * sets up the data needed for the selection screen
     * @param window the window that the entities will be drawn to
     */
    public SelectionState(Window window) {
        this.render = new RendererEngine(window);
        this.entities = new ArrayList<Entity>();

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
     * renders the entities that need to be drawn
     */
    @Override
    public void render() {
        for (Entity entity : entities) {
            render.addEntity(entity);
        }
        render.draw();
    }
}
