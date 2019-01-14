/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levels;

import core.kernal.Window;
import core.renderer.RendererEngine;
import java.util.ArrayList;
import modules.components.Collision;
import modules.components.Gravity;
import modules.components.Movement;
import modules.entities.Entity;

/**
 * Creates new Levels for Fireboy and Watergirl.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Level{

    private boolean levelComplete;
    private final RendererEngine rendererEngine;
    private final ArrayList<Entity> entities;
    public static final int PLAYER = 1;
    public static final int PLATFORM = 2;
    public static final int MOVINGPLATFORM = 3;
    public static final int GEM = 4;
    public static final int OBSTACLE = 5;
    public static final int BUTTON = 6;
    public static final int DOOR = 7;

    /**
     * Initializes a Level of a game of Fireboy and Watergirl using various
     * entities including: Characters, Platforms, Obstacles, Gems, and Doors.
     * Adds all the entities to an array list of entities.
     *
     * @param window a Window that the game entities will be displayed in
     */
    public Level(Window window) {
        this.rendererEngine = new RendererEngine(window);
        this.levelComplete = false;
        this.entities = new ArrayList<>();
    }

    /**
     * Sets the level to be complete.
     */
    public void levelComplete() {
        // determine if the level hasn't been completed
        if (!this.levelComplete) {
            this.levelComplete = true;
        }
    }

    /**
     * Returns whether if the Level has been completed by the user.
     *
     * @return a boolean representing whether or not if the Level has been
     * completed
     */
    public boolean isLevelComplete() {
        return this.levelComplete;
    }

    /**
     * Draws the game entities using a RendererEngine.
     */
    public void draw() {
        this.rendererEngine.draw();
    }

    /**
     * Initializes a Character and adds it to an ArrayList of Entities using its
     * x and y position.
     *
     * @param x an integer representing the x position of the Character
     * @param y an integer representing the y position of the Character
     */
    public void createCharacter(int x, int y) {
        this.entities.add(new Entity(x, y, 30, 40, new Gravity(), new Movement(), new Collision()));
    }

    /**
     * Initializes a Platform and adds it to an ArrayList of Entities using its
     * x and y position, and its width and height.
     *
     * @param x an integer representing the x position of the Platform
     * @param y an integer representing the y position of the Platform
     * @param width an integer representing the width of the Platform
     * @param height an integer representing the height of the Platform
     */
    public void createPlatform(int x, int y, int width, int height) {
        this.entities.add(new Entity(x, y, width, height, new Collision()));
    }

    /**
     * Initializes a MovingPlatform and adds it to an ArrayList of Entities
     * using its x and y position, and its width and height.
     *
     * @param x an integer representing the x position of the MovingPlatform
     * @param y an integer representing the y position of the MovingPlatform
     * @param width an integer representing the width of the Platform
     * @param height an integer representing the height of the Platform
     */
    public void createMovingPlatform(int x, int y, int width, int height) {
        this.entities.add(new Entity(x, y, width, height, new Movement()));
    }

    /**
     * Initializes a Gem and adds it to an ArrayList of Entities using its x and
     * y position.
     *
     * @param x an integer representing the x position of the Gem
     * @param y an integer representing the y position of the Gem
     */
    public void createGems(int x, int y) {
        this.entities.add(new Entity(x, y, 20, 20));
    }

    /**
     * Initializes a obstacle and adds it to an ArrayList of Entities using its
     * x and y position, and its width and height.
     *
     * @param x an integer representing the x position of the obstacle
     * @param y an integer representing the y position of the obstacle
     * @param width an integer representing the width of the obstacle
     * @param height an integer representing the height of the obstacle
     */
    public void createObstacles(int x, int y, int width, int height) {
        this.entities.add(new Entity(x, y, width, height));
    }

    /**
     * Initializes a Button and adds it to an ArrayList of Entities using its x
     * and y position, and its width and height.
     *
     * @param x an integer representing the x position of the Button
     * @param y an integer representing the y position of the Button
     */
    public void createButton(int x, int y) {
        this.entities.add(new Entity(x, y, 20, 10));
    }

    /**
     * Initializes a Door and adds it to an ArrayList of Entities using its x
     * and y position.
     *
     * @param x an integer representing the x position of the Door
     * @param y an integer representing the y position of the Door
     */
    public void createDoor(int x, int y) {
        this.entities.add(new Entity(x, y, 40, 50));
    }
}
