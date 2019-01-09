/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a Fireboy as a subclass of Character in a game of Fireboy and
 * Watergirl. The Fireboy can collect FireGems and only go through the FireDoor
 * when it successfully completes the Level. The Fireboy can also die when it
 * comes into contact with Mud or Water.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class Fireboy extends Character {

    /**
     * Initializes a Fireboy as a Character using its x and y position on the
     * screen.
     *
     * @param x an integer representing its x position on the screen
     * @param y an integer representing its y position on the screen
     */
    public Fireboy(int x, int y) {
        super(x, y);
    }
}
