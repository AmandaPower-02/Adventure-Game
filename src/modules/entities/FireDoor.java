/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.entities;

/**
 * Creates a FireDoor as a subclass of Door to use in a game of Fireboy and
 * Watergirl. FireDoor allows the Fireboy to pass the level. When a Fireboy
 * stands in front of a FireDoor, the Door will open to allow the Fireboy to go
 * through.
 *
 * @author biGgEsT yEeT: tHe fiNaL fOrM
 */
public class FireDoor extends Door {

    /**
     * Initializes a new FireDoor to use in a game of Fireboy and Watergirl.
     *
     * @param x an integer representing the x position of the FireDoor
     * @param y an integer representing the y position of the FireDoor
     */
    public FireDoor(int x, int y) {
        super(x, y);
    }
}
