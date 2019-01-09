/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

import core.renderer.SpriteSheet;
import java.awt.Rectangle;
import java.util.HashMap;
import modules.components.Component;

/**
 * Creates a new Entity to use in a game of Fireboy and Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Entity {

    private int x;
    private int y;
    private int width;
    private int height;
    private boolean isJumping;
    private SpriteSheet look;
    private HashMap<String, Component> components;
    private Rectangle entity;

    public Entity(int x, int y, int width, int height, SpriteSheet photo, Component... components) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.look = look;
        this.isJumping = true;
        this.components = new HashMap<String, Component>();
        for (Component component : components) {
            this.components.put(component.getType(), component);
        }

        initialize();

        this.components = new HashMap<String, Component>();
        for (Component component : components) {
            this.components.put(component.getType(), component);
        }

        initialize();
    }

    /**
     * Initializes a new Entity using its x and y position, and its width and
     * height.
     *
     * @param x an integer representing the x position of the Entity
     * @param y an integer representing the y position of the Entity
     * @param width an integer representing the width of the Entity
     * @param height an integer representing the height of the Entity
     */
    public Entity(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.entity = new Rectangle(this.x, this.y, this.width, this.height);
    }

    private void initialize() {
        for (Component component : components.values()) {
            component.initialize(this);
        }
    }

    public void update() {
        for (Component component : components.values()) {
            component.update(this);
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean getJumping() {
        return this.isJumping;
    }

    public SpriteSheet getLook() {
        return look;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
