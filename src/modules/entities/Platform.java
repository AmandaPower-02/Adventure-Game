/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a Platform as a subclass of Entity to use in a game of Fireboy and
 * Watergirl. Characters can traverse across Platforms throughout each Level to
 * successfully complete them.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Platform extends Entity {

    /**
     * Initializes a Platform as an Entity in a game of Fireboy and Watergirl
     * using its x and y position, and its width and height.
     *
     * @param x an integer representing the x-coordinate of the Platform
     * @param y an integer representing the y-coordinate of the Platform
     * @param width an integer representing the width of the Platform
     * @param height an integer representing the height of the Platform
     */
    public Platform(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
}
