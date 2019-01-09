/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a Watergirl as a subclass of Character in a game of Fireboy and
 * Watergirl. The Watergirl can collect WaterGems and only go through the
 * WaterDoor when it successfully completes the Level. The Watergirl can also
 * die when it comes into contact with Mud or Fire.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Watergirl extends Character {

    /**
     * Initializes a Watergirl using its x and y position on the screen in a
     * game of Fireboy and Watergirl.
     *
     * @param x an integer representing the Watergirl's x position on the screen
     * @param y an integer representing the Watergirl's y position on the screen
     */
    public Watergirl(int x, int y) {
        super(x, y);
    }
}
