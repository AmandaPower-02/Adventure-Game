/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates Water as a subclass of Obstacle to use in game of Fireboy and
 * Watergirl. Water can kill Fireboys when they come into contact with it.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Water extends Obstacle {

    /**
     * Initializes Water as a subclass of Obstacle using its x and y position,
     * and its width and height.
     *
     * @param x an integer representing the x position of the Water
     * @param y an integer representing the y position of the Water
     * @param width an integer representing the width of the Water
     * @param height an integer representing the height of the Water
     */
    public Water(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
}
