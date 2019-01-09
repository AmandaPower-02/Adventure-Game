/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a MovingPlatform as a subclass of Platform to use in a game of
 * Fireboy and Watergirl. MovingPlatforms are controlled by Buttons that
 * Characters can interact with while progressing through each Level.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class MovingPlatform extends Platform {

    /**
     * Initializes a MovingPlatform as a subclass of Platform to use in a game
     * of Fireboy and Watergirl using its x and y position, and its width.
     *
     * @param x an integer representing the x position of the MovingPlatform
     * @param y an integer representing the y position of the MovingPlatform
     * @param width an integer representing the width of the MovingPlatform
     */
    public MovingPlatform(int x, int y, int width) {
        super(x, y, width, 10);
    }
}
