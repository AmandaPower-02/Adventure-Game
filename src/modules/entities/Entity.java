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
public class Entity {

    private int x;
    private int y;
    private final int width, height;
    private SpriteSheet photo;
    private HashMap<String, Component> components;
    private Rectangle entity;

    public Entity(int x, int y, int width, int height, SpriteSheet photo, Component... components) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.photo = photo;
        this.entity = new Rectangle(this.x, this.y, this.width, this.height);

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
        for (Component component : this.components.values()) {
            component.initialize(this);
        }
    }

    public void update() {
        for (Component component : this.components.values()) {
            component.update(this);
        }
    }

    /**
     * Returns the x position of the Entity.
     *
     * @return an integer representing the x position of the Entity
     */
    public int getX() {
        return this.x;
    }

    /**
     * Returns the y position of the Entity.
     *
     * @return an integer representing the y position of the Entity
     */
    public int getY() {
        return this.y;
    }

    /**
     * Returns the width of the Entity.
     *
     * @return an integer representing the width of the Entity
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the Entity.
     *
     * @return an integer representing the height of the Entity
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns the SpriteSheet of the Entity.
     *
     * @return a SpriteSheet representing how the Entity appears as on the
     * screen
     */
    public SpriteSheet getPhoto() {
        return this.photo;
    }

    /**
     * Returns the Rectangle representing the Entity.
     *
     * @return a Rectangle representing the Entity
     */
    public Rectangle getBounds() {
        return this.entity;
    }

    /**
     * Sets the x position of the Entity.
     *
     * @param x an integer representing what the Entity's x position will be
     * modified to be
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y position of the Entity.
     *
     * @param y an integer representing what the Entity's y position will be
     * modified to be
     */
    public void setY(int y) {
        this.y = y;
    }
}