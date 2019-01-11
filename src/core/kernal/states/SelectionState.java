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
 * Creates a SelectionState to use in a game of Fireboy and Watergirl.
 * 
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class SelectionState extends State {

    private ArrayList<Entity> entities;
    private RendererEngine render;

    /**
     * Sets up the data needed for the selection screen.
     *
     * @param window a Window representing the Window that the entities will be
     * drawn to
     */
    public SelectionState(Window window) {
        this.render = new RendererEngine(window);
        this.entities = new ArrayList<Entity>();
    }

    /**
     *
     */
    @Override
    public void update() {
        for (Entity entity : this.entities) {
            entity.update();
        }
    }

    /**
     * 
     */
    @Override
    public void render() {
        for (Entity entity : this.entities) {
            this.render.addEntity(entity);
        }
        this.render.draw();
    }
}
