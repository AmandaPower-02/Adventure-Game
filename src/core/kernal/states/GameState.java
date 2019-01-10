/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.kernal.states;

import core.kernal.Window;
import core.renderer.RendererEngine;
import core.renderer.SpriteSheet;
import java.util.ArrayList;
import modules.components.Movement;
import modules.entities.Entity;

/**
 *
 * @author Amanda
 */
public class GameState extends State {

    private ArrayList<Entity> entities;

    private RendererEngine render;

    public GameState(Window window) {
        this.render = new RendererEngine(window);
        this.entities = new ArrayList<Entity>();
        this.entities.add(new Entity(10, 10, 100, 100, new SpriteSheet("index.jpg", 1), new Movement()));
    }

    @Override
    public void update() {
        for (Entity entity : entities) {
            entity.update();
        }
    }

    @Override
    public void render() {
        for (Entity entity : entities) {
            render.addEntity(entity);
        }
        render.draw();
    }
}