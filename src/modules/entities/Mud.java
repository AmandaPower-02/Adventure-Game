/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates Mud as a subclass of Obstacle to use in a game of Fireboy and
 * Watergirl. Mud can kill all Characters.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Mud extends Obstacle {

    /**
     * Initializes Mud as a subclass of Obstacle using its x and y position, and
     * its width and height.
     *
     * @param x an integer representing the x position of the Mud
     * @param y an integer representing the y position of the Mud
     * @param width an integer representing the width of the Mud
     * @param height an integer representing the height of the Mud
     */
    public Mud(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
}
