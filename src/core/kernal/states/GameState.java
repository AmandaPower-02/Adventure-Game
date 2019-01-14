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
 * Creates a GameState as a subclass of State to use in a game of Fireboy and
 * Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class GameState extends State {

    private ArrayList<Entity> entities;
    private RendererEngine render;

    /**
     * Initializes GameState's data.
     *
     * @param window a Window representing a Window that the game will be
     * displayed in
     */
    public GameState(Window window) {
        this.render = new RendererEngine(window);
        this.entities = new ArrayList<>();
        this.entities.add(new Entity(10, 10, 100, 100, new SpriteSheet("index.jpg", 1), new Movement(), new Gravity(), new Collision()));
        this.entities.add(new Entity(100, 10, 100, 100, new SpriteSheet("index.jpg", 1), new Collision()));
    }

    /**
     * Updates the information in the game.
     */
    @Override
    public void update() {
        for (Entity entity : this.entities) {
            entity.update();
        }
    }

    /**
     * Render the components that have to be drawn to the screen.
     */
    @Override
    public void render() {
        for (Entity entity : this.entities) {
            this.render.addEntity(entity);
        }
        this.render.draw();
    }
}
