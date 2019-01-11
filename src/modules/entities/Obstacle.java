/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

import core.renderer.SpriteSheet;

/**
 * Creates an Obstacle as a subclass of Entity to use in a game of Fireboy and
 * Watergirl. When a Character encounters each Obstacle, they can either utilize
 * it to their advantage, or they can die when they come into contact with it.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public abstract class Obstacle extends Entity {

    /**
     * Initializes an Obstacle to use in a game of Fireboy and Watergirl using
     * its x and y position on the screen, and its width and height.
     *
     * @param x an integer representing the x position of the Obstacle
     * @param y an integer representing the y position of the Obstacle
     * @param width an integer representing the width of the Obstacle
     * @param height an integer representing the height of the
     */
    public Obstacle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Initializes an Obstacle to use in a game of Fireboy and Watergirl usign
     * its x and y position, its width and height, and its appearance on the
     * screen.
     *
     * @param x an integer representing the x position of the Obstacle
     * @param y an integer representing the y position of the Obstacle
     * @param width an integer representing the width of the Obstacle
     * @param height an integer representing the height of the Obstacle
     * @param photo a SpriteSheet representing the appearance of the Obstacle
     */
    public Obstacle(int x, int y, int width, int height, SpriteSheet photo) {
        super(x, y, width, height, photo);
    }
}
