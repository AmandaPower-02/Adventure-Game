/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates Fire as a subclass of Obstacle to use in game of Fireboy and
 * Watergirl. Fire kills Watergirls when they come into contact with it.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Fire extends Obstacle {

    /**
     * Initializes Fire as a subclass of Obstacle using its x and y position,
     * and its width and height.
     *
     * @param x an integer representing the x position of the Fire
     * @param y an integer representing the y position of the Fire
     * @param width an integer representing the width of the Fire
     * @param height an integer representing the height of the Fire
     */
    public Fire(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
}
